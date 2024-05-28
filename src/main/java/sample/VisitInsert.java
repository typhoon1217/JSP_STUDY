package sample;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VisitInsert extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection con = null; 
        PreparedStatement pstmt = null; 
        try {
            con = DBUtil.getConnection();
            if(con != null) {
            	System.out.println("데이터베이스 접속 성공.");
            } else {
            	System.out.println("데이터베이스 접속 실패.");
            }
            
            String sql = "INSERT INTO VISIT VALUES (VISIT_SEQ.NEXTVAL, ?, ?, SYSDATE)";
            String writer = request.getParameter("writer");
            String memo = request.getParameter("memo");
            
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, writer);
            pstmt.setString(2, memo);
            
            int value = pstmt.executeUpdate();

            if (value == 1) {
                response.sendRedirect("VisitList");
            } else {
                System.out.println("메모 수정 실패");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
                try {
                    if(pstmt != null) {
                        pstmt.close();
                    }
                    if(con != null) {
                        con.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
	
	} //end of doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
