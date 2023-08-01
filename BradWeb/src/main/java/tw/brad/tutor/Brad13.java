package tw.brad.tutor;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Brad13 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String src = "C:\\Users\\User\\git\\repository3\\BradWeb\\src\\main\\webapp\\upload\\brad.jpg";
		String str = request.getParameter("str");
		BufferedImage img = ImageIO.read(new File(src));
		Graphics2D g2d = img.createGraphics();
		g2d.setColor(Color.red);
		Font font = new Font(null, Font.BOLD, 64);

		AffineTransform tran = new AffineTransform();
		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i + 1);
			double ang = Math.random() * 60 - 30;
			tran.rotate(Math.toRadians(ang));
			Font font2 = font.deriveFont(tran);
			g2d.setFont(font2);
			g2d.drawString(s, 100 + i * 60, 200);
			tran.rotate(Math.toRadians(ang * -1));
		}

		response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(img, "jpeg", out);
		response.flushBuffer();
		FileOutputStream fout = new FileOutputStream(
				"C:\\Users\\User\\git\\repository3\\BradWeb\\src\\main\\webapp\\upload\\1.jpg");
		ImageIO.write(img, "jpeg", fout);
		fout.flush();
		fout.close();

	}

}
