package net.housebreaker.javasyntax;

import java.util.Arrays;
import java.util.Scanner;

public class p13_GetFirstOddorEvenElements {
	public static void main() {
		System.out.println("\nProblem 13. Get First Odd or Even Elements");
		System.out.print("Please enter 2 lines: ");

		Scanner in = new Scanner(System.in);

		String[] numbersAsString = in.nextLine().split(" ");
		int[] numbers = new int[numbersAsString.length];

		for (int i = 0; i < numbersAsString.length; i++) {
			numbers[i] = Integer.parseInt(numbersAsString[i]);
		}

		String[] command = in.nextLine().split(" ");

		int howManyElements = Integer.parseInt(command[1]);
		int oddOrEven = command[2].equals("even") ? 0 : 1;

		numbers = Arrays.stream(numbers).filter(a -> a % 2 == oddOrEven).toArray();

		try {
			for (int i = 0; i < howManyElements; i++) {
				System.out.print(numbers[i] + " ");
			}
		} catch (IndexOutOfBoundsException ex) {
			return;
		}
	}
}
