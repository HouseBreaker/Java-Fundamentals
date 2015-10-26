package p06_CountSpecifiedWord;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CountSpecifiedWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String word = in.nextLine();

		String[] words = input.split("(?i)\\b" + word + "\\b");

		System.out.println(words.length - 1);
	}
}
