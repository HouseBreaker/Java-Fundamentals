package p12_CardFrequencies;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardFrequencies {
	private static String FindCardRegex = "\\d+|[JAQK]";
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = "8? 2? 4? 10? J? A? K? 10? K? K?"; // in.nextLine();
		String[] cardsStringArr = input.split(FindCardRegex);

		int totalCards = cardsStringArr.length - 1;
		Map<String, Integer> cards = new LinkedHashMap<>();

		ExtractCards(input, cards);

		for (String card : cards.keySet()) {
			System.out.printf("%s -> %.2f%%\n", card, (double) cards.get(card) / totalCards*100);
		}
	}

	private static void ExtractCards(String input, Map<String, Integer> cards) {
		Matcher matcher = Pattern.compile(FindCardRegex).matcher(input);
		
		while (matcher.find()) {
			String card = matcher.group();
			Integer count = cards.get(card);
			if (count == null) {
				count = 0;
			}
			cards.put(card, count + 1);
		}
	}
}
