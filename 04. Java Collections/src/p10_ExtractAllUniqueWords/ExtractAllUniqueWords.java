package p10_ExtractAllUniqueWords;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ExtractAllUniqueWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		ArrayList<String> words = new ArrayList<>();

		Matcher matcher = Pattern.compile("\\b\\w+\\b").matcher(input);

		while (matcher.find()) {
			words.add(matcher.group());
		}

		words = words.stream()
				.distinct()
				.map(a -> a = a.toLowerCase())
				.sorted()
				.collect(Collectors.toCollection(ArrayList::new));

		System.out.println(String.join(" ", words));
	}
}
