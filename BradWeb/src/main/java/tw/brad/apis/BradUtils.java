package tw.brad.apis;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class BradUtils {
	public static String loadView(String view) throws Exception {
		String viewFile = String
				.format("C:\\Users\\User\\git\\repository_eeit69_web\\Web5\\src\\main\\webapp\\views\\%s.html", view);

		File file = new File(viewFile);

//		byte[] buf = new byte[(int)file.length()];
//		FileInputStream fin = new FileInputStream(file);
//		fin.read(buf);
//		fin.close();
//		return new String(buf);

		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		StringBuffer sb = new StringBuffer();
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();

	}

	public static String sayYa() {
		return "Ya";
	}

	public static String sayYa(String name) {
		return String.format("Ya! %s", name);
	}

	public static String calc(String x, String y, String op) {
		try {
			int intX = Integer.parseInt(x);
			int intY = Integer.parseInt(y);
			// int r, mod;
			// r = mod = 0;
			String ret = "";

			switch (op) {
			case "1" -> ret += intX + intY;
			case "2" -> ret += intX - intY;
			case "3" -> ret += intX * intY;
			case "4" -> ret += intX / intY + "...." + intX % intY;
			/*
			 * case "1": r = intX + intY; ret += r; break; case "2": r = intX - intY; ret +=
			 * r; break; case "3": r = intX * intY; ret += r; break; case "4": r = intX /
			 * intY; mod = intX % intY; ret += r + " ... " + mod; break;
			 */
			}
			return ret;

		} catch (Exception e) {
			return "";
		}

	}

	public static Member createMember() {
		return new Member(123, "iii", "III", "1999-09-08");
	}

	public static String createScore() {
		return (int) (Math.random() * 101) + "";
	}

	public static int prevPage(String page) {
		int p = Integer.parseInt(page);
		if (p > 1)
			p--;
		return p;

	}

	public static int nextPage(String page, String pages) {
		int ps = (int) Double.parseDouble(pages);
		int p = Integer.parseInt(page);
		if (p < ps)
			p++;
		return p;
	}

}