package sample;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Source extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("source start");
		request.setAttribute("name", "Lee");
		// 1. 페이지 forward 방식으로 이동
//		RequestDispatcher view = request.getRequestDispatcher("Destination");
//		view.forward(request, response);
		// 2. 페이지 sendRedirect 방식으로 이동
		response.sendRedirect("Destination");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
