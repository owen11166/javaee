package tw.brad.tutor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.Brad19M;

import java.io.IOException;

/**
 * Servlet implementation class Brad18C
 */
public class Brad18C extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String x = request.getParameter("x");
		String y = request.getParameter("y");

		Brad19M model = new Brad19M(x, y);
		int result = model.plus();

		request.setAttribute("x", x);
		request.setAttribute("y", y);
		request.setAttribute("result", result);

		RequestDispatcher dispatcher = request.getRequestDispatcher("Brad20V");
		dispatcher.forward(request, response);
	}

}
