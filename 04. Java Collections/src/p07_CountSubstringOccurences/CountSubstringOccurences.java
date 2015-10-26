package p07_CountSubstringOccurences;

import java.util.Scanner;

public class CountSubstringOccurences {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String word = in.nextLine();

		String[] words = input.split("(?i)" + word);

		System.out.println(words.length - 1);
	}
}
