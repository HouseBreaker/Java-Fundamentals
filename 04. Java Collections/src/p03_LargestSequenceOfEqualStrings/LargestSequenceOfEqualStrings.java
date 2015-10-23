package p03_LargestSequenceOfEqualStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] words = in.nextLine().split(" ");

		String sequence = Arrays.stream(words).collect(Collectors.groupingBy(s -> s))
				.entrySet()
				.stream()
				.max((entry1, entry2) -> entry1.getValue().size() > entry2.getValue().size() ? 1 : -1)
				.get()
				.getValue()
				.stream()
				.map(String::toString)
				.collect(Collectors.joining(" "));

		System.out.println(sequence);
	}
}
