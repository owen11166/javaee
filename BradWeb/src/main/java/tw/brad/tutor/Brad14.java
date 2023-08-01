package tw.brad.tutor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.Bike;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Brad14
 */
public class Brad14 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher dis = request.getRequestDispatcher("Brad15");
		Bike b1 = new Bike("brad");
		request.setAttribute("b1", b1);
		b1.upSpeed();

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>brad company<h1>");
		out.println("<hr/>");
		dis.include(request, response);
		out.println("<hr/>");
		out.println("copyleft...");
	}

}
