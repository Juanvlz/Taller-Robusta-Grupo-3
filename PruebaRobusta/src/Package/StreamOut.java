package Package;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.System.Logger;

public class StreamOut {
	
	public void singleTry() throws IOException {
		BufferedInputStream bis = null;
		FileInputStream fis = new FileInputStream("E:/file.txt");
		bis = new BufferedInputStream(fis);
		try {
			int content;
			while((content = bis.read()) != -1) {
				System.out.println((char) content);
			}
		} finally {
			fis.close();
		}
	}
}
