package p03_FormattingNumbers;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("\nProblem 3. Formatting numbers");
		System.out.print("Please enter 3 float point numbers: ");

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		double b = in.nextDouble(), c = in.nextDouble();

		System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, Integer.parseInt(Integer.toBinaryString(a)), b, c);
	}
}
