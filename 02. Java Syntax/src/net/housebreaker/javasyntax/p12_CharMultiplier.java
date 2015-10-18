package net.housebreaker.javasyntax;

import java.util.Scanner;

public class p12_CharMultiplier {
	public static void main() {
		System.out.println("\nProblem 12. Character Multiplier");
		System.out.print("Please enter 2 words separated by a space: ");

		Scanner in = new Scanner(System.in);

		String[] input = in.nextLine().split(" ");

		int sum = 0;
		String shorterString = "", longerString = "";

		if (input[0].length() < input[1].length()) {
			shorterString = input[0];
			longerString = input[1];
		} else if (input[0].length() > input[1].length()) {
			shorterString = input[1];
			longerString = input[0];
		}

		for (int i = 0; i < shorterString.length(); i++) {
			sum += shorterString.charAt(i) * longerString.charAt(i);
		}

		for (int i = shorterString.length(); i < longerString.length(); i++) {
			sum += longerString.charAt(i);
		}
		System.out.println(sum);
	}
}
