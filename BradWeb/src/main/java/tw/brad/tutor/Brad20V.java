package tw.brad.tutor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.BradUtils;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Brad20V
 */
public class Brad20V extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String x = (String) request.getAttribute("x");
		String y = (String) request.getAttribute("y");
		
		if(x!=null&&y!=null) {
			
			
		}
		
		Integer result = (Integer) request.getAttribute("result");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		try {
			String content=BradUtils.loadView();
			out.printf(content,x,y,result);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
