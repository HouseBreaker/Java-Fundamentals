package p09_HitTheTarget;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("\nProblem 9. Hit the target");
		System.out.print("Please enter target: ");

		Scanner in = new Scanner(System.in);

		int target = in.nextInt();

		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 20; j++) {
				if (i + j == target) {
					System.out.printf("%d + %d = %d", i, j, target);
					System.out.println();
				}

				if (i - j == target) {
					System.out.printf("%d - %d = %d", i, j, target);
					System.out.println();
				}
			}
		}
	}
}
