package p08_ExtractEmails;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractEmails {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();

		Matcher matcher = Pattern.compile("(?<user>[a-z0-9.-_]+)@(?<host>\\w+.\\w+\\.\\w+)").matcher(input);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
