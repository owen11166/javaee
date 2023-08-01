package tw.brad.apis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class BradUtils {
	public static String loadView() throws Exception {
		String viewFile = "C:\\Users\\User\\git\\repository3\\BradWeb\\src\\main\\webapp\\views\\view1.html";
		File file = new File(viewFile);
		byte[] buf = new byte[(int) file.length()];
		FileInputStream fin = new FileInputStream(file);
		fin.read(buf);
		fin.close();
		return new String(buf);
	}
}
