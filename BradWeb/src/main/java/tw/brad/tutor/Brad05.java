package tw.brad.tutor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Brad05
 */
public class Brad05 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	 String y=request.getParameter("y");
	 String x=request.getParameter("x");
	 System.out.printf("%s:%s",x,y);
	 int result=Integer.parseInt(x)+Integer.parseInt(y);
	 response.setContentType("text/html;charset=UTF-8");
	 PrintWriter out=response.getWriter();
	 out.printf("%s+%s=%d",x,y,result);
	}

}
