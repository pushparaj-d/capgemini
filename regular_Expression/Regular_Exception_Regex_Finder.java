package regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Exception_Regex_Finder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter regex pattern:");
			Pattern pattern = Pattern.compile(sc.nextLine());
			System.out.println("Enter text:");
			Matcher matcher = pattern.matcher(sc.nextLine());
			boolean found = false;
			sc.close();
			while (matcher.find()) {
				System.out.println("I found the text " + matcher.group() + " starting at index " + matcher.start()
						+ " and ending at index " + matcher.end());
				found = true;
			}
			if (!found) {
				System.out.println("No match found.");
			}
		}

	}
}
