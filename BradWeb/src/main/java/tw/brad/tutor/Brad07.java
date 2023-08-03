package tw.brad.tutor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Brad07
 */
public class Brad07 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String x, y, r, op;
		x = y = r = op = "";
		if (request.getParameter("x") != null) {
			y = request.getParameter("y");
			x = request.getParameter("x");
			op = request.getParameter("op");
			System.out.printf("%s:%s\n", x, y);

			int result, mod;
			switch (op) {
			case "1" -> r = (Integer.parseInt(x) + Integer.parseInt(y)) + "";
			case "2" -> r = (Integer.parseInt(x) - Integer.parseInt(y)) + "";
			case "3" -> r = (Integer.parseInt(x) * Integer.parseInt(y)) + "";
			case "4" -> {
				result = Integer.parseInt(x) / Integer.parseInt(y);
				mod = Integer.parseInt(x) % Integer.parseInt(y);
				r = result + "...." + mod;
			}

			}
		}
		;
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<form>");
		out.printf("<input name='x' value='%s'>\n", x);
		out.println("<select name='op'>\n");
		out.printf("<option value='1' %s>+</option>\n", (op.equals("1")?"selected":""));
		out.printf("<option value='2' %s>-</option>\n", (op.equals("2")?"selected":""));
		out.printf("<option value='3' %s>x</option>\n", (op.equals("3")?"selected":""));
		out.printf("<option value='4' %s>/</option>\n", (op.equals("4")?"selected":""));
		out.println("</select>");
		out.printf("<input name='y' value='%s'>\n", y);
		out.println("<input type=\"submit\" value=\"=\">");
		out.println(r);
		out.println("</form>");
	}
}

/*
 * <form action="Brad05"> <input name="x"> + <input name="y"> <input
 * type="submit" value="="> </form>
 */
