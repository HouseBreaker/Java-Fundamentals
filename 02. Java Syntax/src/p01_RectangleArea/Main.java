package p01_RectangleArea;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("\nProblem 1. Rectangle Area");

		System.out.print("Please input 2 integers separated by a space: ");
		Scanner in = new Scanner(System.in);

		int width = in.nextInt(), height = in.nextInt();
		int area = width * height;

		System.out.println("Area = " + area);
	}
}
