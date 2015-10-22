package p03_CountCharacterTypes;

import java.io.*;

public class CountCharacterTypes {
	public static void main(String[] args) {
		try (
				BufferedReader bfr =
						new BufferedReader(new FileReader("res/p03_CountCharacterTypes/input.txt"));
				BufferedWriter bfw =
						new BufferedWriter(new PrintWriter("res/p03_CountCharacterTypes/count-chars.txt"))
				// you could easily overwrite the original file, but I chose this approach instead
		) {
			int vowels = 0, consonants = 0, punctuation = 0;


			String punctuationList = "!,.?";
			String vowelList = "aeiou";

			String currentLn;
			while ((currentLn = bfr.readLine()) != null) {
				// do stuff with the file
				for (int i = 0; i < currentLn.length(); i++) {

					char current = currentLn.charAt(i);

					if (punctuationList.indexOf(current) != -1) {
						punctuation++;
					} else if (vowelList.indexOf(current) != -1) {
						vowels++;
					} else if ((current >= 'A' && current <= 'Z') || (current >= 'a' && current <= 'z')) {
						consonants++;
					}
				}

				String nl = "\r\n";

				bfw.write("Vowels: " + vowels + nl);
				bfw.write("Consonants: " + consonants + nl);
				bfw.write("Punctuation: " + punctuation);
			}
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
}
