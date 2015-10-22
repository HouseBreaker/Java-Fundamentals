package p01_SumLines;

import java.io.*;

public class SumLines {
	public static void main(String[] args) {
		try (
				BufferedReader bfr =
						new BufferedReader(new FileReader("res/p01_SumLines/input.txt"))

		) {
			String currentLn;
			while ((currentLn = bfr.readLine()) != null) {
				System.out.println(currentLn);
			}
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
}
