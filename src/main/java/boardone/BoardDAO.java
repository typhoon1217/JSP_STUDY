package boardone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.DBPoolUtil;

//싱글톤방식 객체 생성
public class BoardDAO {
	private static BoardDAO instance = null;

	private BoardDAO() {
	}

	public static BoardDAO getInstance() {
		if (instance == null) {
			synchronized (BoardDAO.class) {
				instance = new BoardDAO();
			}
		}
		return instance;
	}

	// 입력(새로운글 입력, 답변글입력)
	public boolean insertArticle(BoardVO article) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		int num = article.getNum();
		int ref = article.getRef();
		int step = article.getStep();
		int depth = article.getDepth();
		int number = 0;
		try {
			conn = DBPoolUtil.makeConnection();
			// 가장최근 num 값을 가져온다. =>nvl(max(num),0)+1
			pstmt = conn.prepareStatement("select nvl(max(num),0)+1 from board");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				number = rs.getInt(1);
			} else {
				number = 1;
			}
			// 답변글인지, 새글인지 구분
			if (num != 0) { // 답글
				pstmt = conn.prepareStatement("update board set step=step+1 where ref = ? and step > ?");
				pstmt.setInt(1, ref);
				pstmt.setInt(2, step);
				pstmt.executeUpdate();
				step = step + 1;
				depth = depth + 1;
			} else { // 새글
				ref = number;
				step = 0;
				depth = 0;
			}
			// 글 저장
			String sql = "insert into board(num, writer, email, subject, pass,"
					+ " regdate, ref, step, depth, content, ip)" + " values(board_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getWriter());
			pstmt.setString(2, article.getEmail());
			pstmt.setString(3, article.getSubject());
			pstmt.setString(4, article.getPass());
			pstmt.setTimestamp(5, article.getRegdate());
			pstmt.setInt(6, ref);
			pstmt.setInt(7, step);
			pstmt.setInt(8, depth);
			pstmt.setString(9, article.getContent());
			pstmt.setString(10, article.getIp());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				flag = true;
			}
		} catch (Exception ex) {
			System.out.println("Exception" + ex);
		} finally {
			DBPoolUtil.dbReleaseClose(rs, pstmt, conn);
		}
		return flag;
	}

	public List<BoardVO> getArticles(/* 수정<1> */) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardVO> articleList = null;
		try {
			conn = DBPoolUtil.makeConnection();
			/* <수정2> */
			pstmt = conn.prepareStatement("select * from board order by num desc");// 수정 <3>
			rs = pstmt.executeQuery();
			if (rs.next()) {
				articleList = new ArrayList<BoardVO>();// 수정<4>
				while (rs.next()) {
					BoardVO article = new BoardVO();
					article.setNum(rs.getInt("num"));
					article.setWriter(rs.getString("writer"));
					article.setEmail(rs.getString("email"));
					article.setSubject(rs.getString("subject"));
					article.setPass(rs.getString("pass"));
					article.setRegdate(rs.getTimestamp("regdate"));
					article.setReadcount(rs.getInt("readcount"));
					article.setRef(rs.getInt("ref"));
					article.setStep(rs.getInt("step"));
					article.setDepth(rs.getInt("depth"));
					article.setContent(rs.getString("content"));
					article.setIp(rs.getString("ip"));
					articleList.add(article);
				};
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			DBPoolUtil.dbReleaseClose(rs, pstmt, conn);
		}
		return articleList;
	}

}
