package p06_UserLogs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogs {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		TreeMap<String, Map<String, Integer>> database = new TreeMap<>();

		while (!input.equals("end")) {
			Matcher matcher = Pattern.compile("IP=(.+) message='.*' user=(\\w+)").matcher(input);

			if (matcher.find()) {
				String name = matcher.group(2);
				String ip = matcher.group(1);

				if (!database.containsKey(name)) {
					database.put(name, new LinkedHashMap<>());
				}

				if (!database.get(name).containsKey(ip)) {
					database.get(name).put(ip, 1);
				} else {
					database.get(name).put(ip, database.get(name).get(ip) + 1);
				}
			}

			input = in.nextLine();
		}

		for (Map.Entry<String, Map<String, Integer>> user : database.entrySet()) {
			System.out.printf("%s: ", user.getKey());
			System.out.println();

			int iterator = 1;
			int total = user.getValue().size();

			for (Map.Entry<String, Integer> ipCountEntry : user.getValue().entrySet()) {
				if (iterator < total) {
					System.out.printf("%s => %d, ", ipCountEntry.getKey(), ipCountEntry.getValue());
					iterator++;
				} else {
					System.out.printf("%s => %d.", ipCountEntry.getKey(), ipCountEntry.getValue());
					System.out.println();
				}
			}
		}
	}
}
