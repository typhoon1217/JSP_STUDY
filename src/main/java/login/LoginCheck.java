package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginCheck extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		// db와 연결해서 확인할 것
		String sql = "SELECT MEMBERID, MEMBERPW FROM SIGNUP WHERE MEMBERID= ? AND MEMBERPW= ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String idCheck = null;
		String pwCheck = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				idCheck = rs.getString("MEMBERID");
				pwCheck = rs.getString("MEMBERPW");
			} else {
				System.out.println("존재하지않는 계정입니다.");
			}

		} catch (Exception e) {
			System.out.println(e);
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

		if (id.equals(idCheck) && password.equals(pwCheck)) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
		}
		response.sendRedirect("Login");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
