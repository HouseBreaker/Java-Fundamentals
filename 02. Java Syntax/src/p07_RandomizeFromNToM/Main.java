package p07_RandomizeFromNToM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("\nProblem 7. Randomize numbers from N to M");
		System.out.print("Please enter N and M: ");

		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), m = in.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = Math.min(n, m); i <= Math.max(n, m); i++) {
			list.add(i);
		}

		Random rnd = new Random();

		int count = list.size();
		while (count > 0) {
			int randomIndex = rnd.nextInt(count);
			System.out.format("%d ", list.remove(randomIndex));
			count--;
		}
	}
}
