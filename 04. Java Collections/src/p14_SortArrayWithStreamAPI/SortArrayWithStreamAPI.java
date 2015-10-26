package p14_SortArrayWithStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class SortArrayWithStreamAPI {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		List<Integer> numbers = Arrays.asList(input.split(" "))
				.stream()
				.map(Integer::parseInt)
				.sorted()
				.collect(Collectors.toList());

		boolean descending = in.nextLine().startsWith("Descending");

		if (descending){
			Collections.sort(numbers, Collections.reverseOrder());
		}

		for (int number : numbers){
			System.out.print(number + " ");
		}
	}
}
