package tw.brad.tutor;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
public class Brad11 extends HttpServlet {
    public Brad11() {
    	System.out.println("Brad11()");
    }

    
    
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service(1)");
		System.out.println(req.getMethod());
		
//		if (req.getMethod().equals("GET")) {
//			
//		}else if (req.getMethod().equals("POST")) {
//			
//		}
		
		//super.service(req, resp);
	}



	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service(2)");
		super.service(req, res);
	}



	@Override
	public void init() throws ServletException {
		System.out.println("init()");
		super.init();
	}



	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig)");
		//super.init(config);
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doGet()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doPost()");
	}

}

