package tw.brad.tutor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;

/**
 * Servlet implementation class Brad09
 */
@MultipartConfig(location = "C:\\Users\\User\\eclipse-workspace\\Work\\BradWeb\\src\\main\\webapp\\upload"

)
public class Brad09 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Part part = request.getPart("upload");
		System.out.println(part.getSize());
		System.out.println(part.getContentType());
		System.out.println(part.getName());
		System.out.println(part.getSubmittedFileName());
		if (part.getSize() > 0) {
			part.write(part.getSubmittedFileName());
		}
	}

}
