package p11_MostFrequentWord;

import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class MostFrequentWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = "Hello my friend, hello my darling. Come on, come here. Welcome, welcome darling."; // in.nextLine();
		Map<String, Integer> words = new HashMap<>();

		ExtractWords(input, words);

		TreeMap<String, Integer> filteredWords = FilterWords(words);

		for (String word : filteredWords.keySet()) {
			System.out.println(word + " -> " + words.get(word) + " times");
		}
	}

	private static TreeMap<String, Integer> FilterWords(Map<String, Integer> words) {
		return words
				.entrySet()
				.stream()
				.filter(a -> a.getValue() == GetMostFrequentWordCount(words))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, TreeMap::new));
	}

	private static void ExtractWords(String input, Map<String, Integer> words) {
		Matcher matcher = Pattern.compile("\\b\\w+\\b").matcher(input);

		while (matcher.find()) {
			String word = matcher.group();
			Integer count = words.get(word);
			if (count == null) {
				count = 0;
			}
			words.put(word.toLowerCase(), count + 1);
		}
	}

	private static int GetMostFrequentWordCount(Map<String, Integer> words) {
		int mostFrequentWordCount = 0;

		for (String word : words.keySet()) {
			int count = words.get(word);

			if (count > mostFrequentWordCount) {
				mostFrequentWordCount = count;
			}
		}
		return mostFrequentWordCount;
	}
}
