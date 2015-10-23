package p01_SortArrayOfNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int length = in.nextInt();
		int[] numbers = new int[length];

		for (int i = 0; i < length; i++) {
			numbers[i] = in.nextInt();
		}

		Arrays.sort(numbers);

		String numbersAsString = Arrays.toString(numbers).split("[\\[\\]]")[1];
		System.out.println(numbersAsString);
	}
}
