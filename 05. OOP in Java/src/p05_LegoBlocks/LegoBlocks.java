package p05_LegoBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class LegoBlocks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = Integer.parseInt(in.nextLine());

		int[][] arrayOne = new int[rows][];
		int[][] arrayTwo = new int[rows][];
		int[][] arrayThree = new int[rows][];

		// input first array
		for (int row = 0; row < rows; row++) {
			arrayOne[row] = parseInputToArray(in.nextLine());
		}

		// input second array (reversed)
		for (int row = 0; row < rows; row++) {
			String reversedInput = new StringBuilder(in.nextLine()).reverse().toString();
			arrayTwo[row] = parseInputToArray(reversedInput);
		}

		int checkLength = arrayOne[0].length + arrayTwo[0].length;
		boolean arraysFit = true;
		int totalCount = 0;


		//combine 'em
		for (int i = 0; i < rows; i++) {
			int currentLength = arrayOne[i].length + arrayTwo[i].length;
			totalCount += currentLength;

			if (currentLength != checkLength) {
				arraysFit = false;
				//break;
			}

			arrayThree[i] = new int[currentLength];

			System.arraycopy(arrayOne[i], 0, arrayThree[i], 0, arrayOne[i].length);
			System.arraycopy(arrayTwo[i], 0, arrayThree[i], arrayOne[i].length, arrayTwo[i].length);
		}

		if (arraysFit) {
			for (int[] ints : arrayThree) {
				System.out.println(Arrays.toString(ints));
			}
		} else {
			System.out.println("The total number of cells is: " + (totalCount));
		}

	}

	static int[] parseInputToArray(String input) {
		return Arrays.stream(input
				.trim()
				.split("[\\s]+"))
				.mapToInt(Integer::parseInt)
				.toArray();
	}
}
