package tw.brad.tutor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.Collection;

@MultipartConfig(location = "C:\\Users\\User\\git\\repository3\\BradWeb\\src\\main\\webapp\\upload"

)
public class Brad10 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String account = request.getParameter("account");
		System.out.println(account);
		String ip = request.getRemoteAddr();
		int i = 1;

		Collection<Part> parts = request.getParts();
		for (Part part : parts) {
			// System.out.println(part.getName());
			// System.out.println(part.getContentType());
			// System.out.println(part.getSize());
			if (part.getContentType() != null && part.getSize() > 0) {
				part.write(getUploadName(ip, part.getSubmittedFileName(), i++));
			}
		}

	}

	private String getUploadName(String ip, String sname, int index) {
		ip = ip.replace(":", "_");
		String[] snames = sname.split("\\.");
		String subname = "";
		if (snames.length > 1) {
			subname = snames[snames.length - 1];
		}
		return ip + "_" + index + subname;
	}
}
