package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.*;
import javax.sql.DataSource;


//컨텍스트 사용  커넥션풀 안통하고 라이브러리 통함 
public class DBPoolUtil2 {

	public static Connection makeConnection() {
		// ConnectionPool pool = ConnectionPool.getInstance();
		Connection con = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/myOracle");
			con = ds.getConnection();
			System.out.println("데이타베이스접속 성공");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이타베이스 연결 실패");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void dbReleaseClose(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException ex) {
		}

		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException ex) {
		}
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception ex) {
		}
	}

	public static void dbReleaseClose(Statement stmt, Connection conn) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException ex) {
		}
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception ex) {
		}
	}

}
