package p05_CountAllWords;

import java.util.Scanner;

public class CountAllWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] words = in.nextLine().split("\\b\\w+\\b");

		System.out.println(words.length - 1);
	}
}
