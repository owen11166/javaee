package tw.brad.tutor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.Bike;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Brad15
 */
public class Brad15 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int max = 0;
		try {
			max = Integer.parseInt(request.getParameter("max"));
		} catch (Exception e) {

		}
		PrintWriter out = response.getWriter();
		out.print((int) (Math.random() * max + 1));
		out.println("<hr/>");
		Object obj = request.getAttribute("b1");
		Bike b1 = (Bike) obj;

		out.print(b1);
	}
}
