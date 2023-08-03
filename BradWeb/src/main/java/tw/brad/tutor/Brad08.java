package tw.brad.tutor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * Servlet implementation class Brad08
 */
public class Brad08 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");

		String[] hobbies = request.getParameterValues("hobby");

		System.out.println(account + ":" + passwd + ":" + gender);
		Arrays.stream(hobbies).forEach(hobby->System.out.println(hobby));
		response.setContentType("text/html;charset=utf-8");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		/*
		 * System.out.println("dopost()"); request.setCharacterEncoding("UTF-8");
		 * 
		 * String account = request.getParameter("account"); String passwd =
		 * request.getParameter("passwd"); System.out.println(account + ":" + passwd);
		 * response.setContentType("text/html;charset=utf-8");
		 */
	}
}
