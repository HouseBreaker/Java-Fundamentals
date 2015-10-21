package p02_ALLCAPITALS;

import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main() {
		try (
				BufferedReader bfr =
						new BufferedReader(new FileReader("res/p02_ALLCAPITALS/input.txt"));
				BufferedWriter bfw =
						new BufferedWriter(new PrintWriter("res/p02_ALLCAPITALS/out.txt"))
				// you could easily overwrite the original file, but I chose this approach instead
		) {
			ArrayList<String> lines = new ArrayList<>();

			String currentLn;
			while ((currentLn = bfr.readLine()) != null) {
				lines.add(currentLn.toUpperCase());
			}
			bfw.write(String.join("\r\n", lines));

		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
}
