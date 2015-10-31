package p03_GandalfsStash;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GandalfsStash {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int mood = Integer.parseInt(in.nextLine());
		String input = in.nextLine();

		ArrayList<String> foodList = new ArrayList<>();

		Matcher matcher = Pattern.compile("([^\\W_]+)(?=\\W*)").matcher(input);

		while (matcher.find()) {
			foodList.add(matcher.group().toLowerCase());
		}

		for (String food : foodList){
			switch (food)
			{
				case "cram":		mood += 2;	break;
				case "lembas":		mood += 3;	break;
				case "apple":		mood += 1;	break;
				case "melon":		mood += 1;	break;
				case "honeycake":	mood += 5;	break;
				case "mushrooms":	mood -= 10;	break;
				default:			mood -= 1;	break;
			}
		}

		System.out.println(mood);

		if (mood < -5)
		{
			System.out.println("Angry");
		}
		else if ((mood >= -5) && (mood < 0))
		{
			System.out.println("Sad");
		}
		else if ((mood <= 15) && (mood >= 0))
		{
			System.out.println("Happy");
		}
		else if (mood > 15)
		{
			System.out.println("Special JavaScript mood");
		}
	}
}
