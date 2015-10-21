package p11_StartsAndEndsWithCapital;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		System.out.println("\nProblem 11. Starts and Ends With Capital Letter");
		System.out.print("Please enter words to extract: ");

		Scanner in = new Scanner(System.in);
		String line = in.nextLine();

		Pattern regex = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b");
		Matcher match = regex.matcher(line);

		ArrayList<String> words = new ArrayList<>();

		while (match.find()) {
			words.add(match.group(0));
		}

		System.out.println(String.join(" ", words));
	}
}
