package sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyFirstServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청한 페이지를 만들어서 보내야 함.
		
		// 1. 문자셋 설정
		response.setContentType("text/html;charset=utf-8");
		// 2. 필요한 자료가 있으면 데이터베이스에서 자료를 가져온다. (오라클 클래스 로드, 접속, 쿼리...정보를 가져온다)
		Date date = new Date();
		// 3. 자료를 (HTML구조를 만들어서 보낸다)
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html lang=\"en\">");
		pw.println("<head>");
		pw.println("<title>나의</title>");
		pw.println("</head>");
		pw.println("<body>");
		for(int i=0; i<3; i++) {
			pw.println("<h1>"+date.toString()+"</h1>");
		}
		pw.println("</body>");
		pw.println("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
