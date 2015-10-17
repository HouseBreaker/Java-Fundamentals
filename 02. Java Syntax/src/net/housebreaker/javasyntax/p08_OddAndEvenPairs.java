package net.housebreaker.javasyntax;

import java.util.Scanner;

public class p08_OddAndEvenPairs {
	public static void main() {
		System.out.println("\nProblem 8. Odd and even pairs");
		System.out.print("Please enter string array separated by space: ");

		Scanner in = new Scanner(System.in);

		String input = in.nextLine();

		String[] arrayString = input.split(" ");

		int[] array = new int[arrayString.length];
		for (int i = 0; i < arrayString.length; i++) {
			array[i] = Integer.parseInt(arrayString[i]);
		}

		if (array.length % 2 == 1) {
			System.out.println("Invalid Length");
			return;
		}

		for (int i = 0; i < array.length - 1; i += 2) {
			if (array[i] % 2 == 0 && array[i + 1] % 2 == 0) {
				System.out.printf("%d, %d -> both are even", array[i], array[i + 1]);
				System.out.println();
			} else if (array[i] % 2 == 1 && array[i + 1] % 2 == 1) {
				System.out.printf("%d, %d -> both are odd", array[i], array[i + 1]);
				System.out.println();
			} else {
				System.out.printf("%d, %d -> different", array[i], array[i + 1]);
				System.out.println();
			}
		}
		// 2 8 11 15 3 2
	}
}

