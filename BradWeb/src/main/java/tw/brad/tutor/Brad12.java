package tw.brad.tutor;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Brad12 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int w = 400, h = 20;
		double rate = Double.parseDouble(request.getParameter("rate")); 
		
		response.setContentType("image/jpeg");
		
		BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = img.createGraphics();
		
		g2d.setColor(Color.YELLOW);
		g2d.fillRect(0, 0, w, h);
		g2d.setColor(Color.RED);
		g2d.fillRect(0, 0, (int)(rate/100*w), h);
		
		
		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(img, "jpeg", out);
		
		response.flushBuffer();
		
	}

}
