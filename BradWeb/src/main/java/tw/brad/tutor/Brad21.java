package tw.brad.tutor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Brad21 extends HttpServlet {
	private Connection conn = null;
	public Brad21(){
		try {
			Properties prop=new Properties();
			prop.put("user","root");
			prop.put("password", "root");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
			
			String sql="INSERT INTO cust (cname,tel,birthday)"+"VALUES ('servlet','11166','1999-02-03')";
			Statement stmt=conn.createStatement();
			int count=stmt.executeUpdate(sql);
			System.out.println("ok2"+count);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
