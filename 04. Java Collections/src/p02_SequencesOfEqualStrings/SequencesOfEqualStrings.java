package p02_SequencesOfEqualStrings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class SequencesOfEqualStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<String> allMatches = new ArrayList<>();
		Matcher regex = Pattern.compile("(((\\w+) )\\2*\\3)|(\\w+)").matcher(in.nextLine());

		while (regex.find()) {
			allMatches.add(regex.group());
		}

		System.out.print(String.join("\n", allMatches));

	}
}
