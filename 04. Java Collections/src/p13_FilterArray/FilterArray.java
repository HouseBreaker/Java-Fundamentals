package p13_FilterArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String[] words = input.split(" ");

		List<String> output = new ArrayList<>();

		Arrays.stream(words).filter(a -> a.length() > 3).forEach(output::add);

		if (output.size() > 0) {
			System.out.println(String.join(" ", output));
		} else {
			System.out.println("(empty)");
		}
	}
}
