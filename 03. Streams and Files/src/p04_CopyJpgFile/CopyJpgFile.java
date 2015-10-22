package p04_CopyJpgFile;

import java.io.*;

public class CopyJpgFile {
	public static void main(String[] args) {
		try (
				FileInputStream fis =
						new FileInputStream("res/p04_CopyJpgFile/java.jpg");
				FileOutputStream fos =
						new FileOutputStream("res/p04_CopyJpgFile/java_copied.jpg")
		){
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
		}
		catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
}
