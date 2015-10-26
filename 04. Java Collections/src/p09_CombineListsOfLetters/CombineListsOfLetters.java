package p09_CombineListsOfLetters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CombineListsOfLetters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String firstLine = in.nextLine();
		String secondLine = in.nextLine();

		ArrayList<Character> output = new ArrayList<>();
		
		for (char c : firstLine.toCharArray()) {
			output.add(c);
		}
		
		for (char c : secondLine.toCharArray()) {
			if (firstLine.indexOf(c) == -1) {
				output.add(c);
			}
		}

		output.removeAll(Collections.singleton(' '));
		output.forEach(a -> System.out.print(a + " "));
	}
}
