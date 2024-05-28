package sampleMember;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sample.DBUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberInsert extends HttpServlet {

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
            
            String sql = "INSERT INTO SIGNUP \r\n"
            		+ "VALUES (SIGNUP_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            String memberId = request.getParameter("memberId");
            String memberPw = request.getParameter("memberPw");
            String memberPwPw = request.getParameter("memberPwPw");
            String memberName = request.getParameter("memberName");
            String memberNickName = request.getParameter("memberNickName");
            String memberEmail = request.getParameter("memberEmail");
            String memberRoute = request.getParameter("memberRoute");
            String memberPhone = request.getParameter("memberPhone");
            String memberBirth = request.getParameter("memberBirth");
            
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, memberId);
            pstmt.setString(2, memberPw);
            pstmt.setString(3, memberPwPw);
            pstmt.setString(4, memberName);
            pstmt.setString(5, memberNickName);
            pstmt.setString(6, memberEmail);
            pstmt.setString(7, memberRoute);
            pstmt.setString(8, memberPhone);
            pstmt.setString(9, memberBirth);
            
            int value = pstmt.executeUpdate();

            if (value == 1) {
                response.sendRedirect("MemberList");
            } else {
                System.out.println("회원 가입 실패");
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
	
	
	
	}//end of doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
