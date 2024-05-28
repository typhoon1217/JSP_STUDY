package sampleMember;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sample.DBUtil;
import sample.Visit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberList extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		List<Member> memberList = null;
		
		String sql = "SELECT * FROM signup";
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DBUtil.getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            memberList = new ArrayList<>();
            while (rs.next()) {
                Member member = new Member();
                member.setNo(rs.getInt("no"));
                member.setMemberId(rs.getString("memberId"));
                member.setMemberPw(rs.getString("memberPw"));
                member.setMemberPwPw(rs.getString("memberPwPw"));
                member.setMemberName(rs.getString("memberName"));
                member.setMemberNickName(rs.getString("memberNickName"));
                member.setMemberEmail(rs.getString("memberEmail"));
                member.setMemberRoute(rs.getString("memberRoute"));
                member.setMemberPhone(rs.getString("memberPhone"));
                member.setMemberBirth(rs.getString("memberBirth"));
                
                memberList.add(member);
                
            }
        } catch (Exception se) {
            se.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception se) {
            }
        }
        
     // 메모장출력부분
     		pw.println("<html>");
     		pw.println(" <head>");
     		pw.println("<title>회원 리스트</title>");
     		pw.println("</head>");
     		pw.println(" <body>");
     		pw.println(" <table align=\"center\" width=\"500\" border=\"1\">");
     		for(Member data  :  memberList) {
     			 pw.println("<tr>");
     	         pw.println("<th width=\"70\">번호</th>");
     	         pw.println("<td width=\"430\">"+data.getNo()+"</td>"); 
     	         pw.println("</tr>");
     			 pw.println("<tr>");
     	         pw.println("<th width=\"70\">아이디</th>");
     	         pw.println("<td width=\"430\">"+data.getMemberId()+"</td>"); 
     	         pw.println("</tr>");
     	         pw.println("<tr>");
     	         pw.println("<th width=\"70\">비밀번호</th>");
     	         pw.println("<td width=\"430\">"+data.getMemberPw()+"</td>"); 
     	         pw.println("</tr>");
     	         pw.println("<tr>");
     	         pw.println("<th width=\"70\">비밀번호검증</th>");
     	         pw.println("<td width=\"430\">"+data.getMemberPwPw()+"</td>"); 
     	         pw.println("</tr>");
     	         pw.println("<tr>");
    	         pw.println("<th width=\"70\">이름</th>");
    	         pw.println("<td width=\"430\">"+data.getMemberName()+"</td>"); 
    	         pw.println("</tr>");
    	         pw.println("<tr>");
     	         pw.println("<th width=\"70\">닉네임</th>");
     	         pw.println("<td width=\"430\">"+data.getMemberNickName()+"</td>"); 
     	         pw.println("</tr>");
     	         pw.println("<tr>");
    	         pw.println("<th width=\"70\">이메일</th>");
    	         pw.println("<td width=\"430\">"+data.getMemberEmail()+"</td>"); 
    	         pw.println("</tr>");
    	         pw.println("<tr>");
    	         pw.println("<th width=\"70\">가입경로</th>");
    	         pw.println("<td width=\"430\">"+data.getMemberRoute()+"</td>"); 
    	         pw.println("</tr>");
    	         pw.println("<tr>");
    	         pw.println("<th width=\"70\">전화번호</th>");
    	         pw.println("<td width=\"430\">"+data.getMemberPhone()+"</td>"); 
    	         pw.println("</tr>");
    	         pw.println("<tr>");
    	         pw.println("<th width=\"70\">생년월일</th>");
    	         pw.println("<td width=\"430\">"+data.getMemberBirth()+"</td>"); 
    	         pw.println("</tr>");
     	         pw.println("<tr>");
     	         pw.println("<td colspan= \"2\" style=\" background-color:black;\" >&nbsp;</td>");
     	         pw.println("</tr>"); 
     		}
     		pw.println(" </table>");
     		pw.println("<p align=\"center\"><a href=\"http://localhost:8080/JSPstudy/Login\">로그인하기</a></p>");
     		pw.println(" </body>");
     		pw.println("</html>");
     		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
