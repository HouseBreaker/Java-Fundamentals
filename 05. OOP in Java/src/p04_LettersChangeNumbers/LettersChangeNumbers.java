package p04_LettersChangeNumbers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LettersChangeNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		ArrayList<String> listOfStrings = new ArrayList<>();

		Matcher matcher = Pattern.compile("([^\\W_]+)(?=\\W*)").matcher(input);

		while (matcher.find()) {
			listOfStrings.add(matcher.group());
		}

		double total = 0;
		
		for (String word : listOfStrings) {
			double theNumber = Double.parseDouble(word.substring(1, word.length() - 1));

			char[] chars = {word.charAt(0), word.charAt(word.length() - 1)};

			if (chars[0] >= 'A' && chars[0] <= 'Z') {
				theNumber /= chars[0] - 'A' + 1;
			} else if (chars[0] >= 'a' && chars[0] <= 'z') {
				theNumber *= chars[0] - 'a' + 1;
			}

			if (chars[1] >= 'A' && chars[1] <= 'Z') {
				theNumber -= chars[1] - 'A' + 1;
			} else if (chars[1] >= 'a' && chars[0] <= 'z') {
				theNumber += chars[1] - 'a' + 1;

			}

			total += theNumber;
		}
		System.out.printf("%.2f", total);
	}
}
