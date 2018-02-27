package lab4Java;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
	public String readInputText() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = scan.nextLine();
		return s;

	}

	public String processText(String inputText) {
		String finalStr = new String();
		String[] strArray = inputText.split(" ");
		Pattern p = Pattern.compile("[aeyuoi]", Pattern.CASE_INSENSITIVE);

		for (String varriable : strArray) {
			Matcher matcher = p.matcher(varriable);
			int k = 0;
			while (matcher.find()) {
				k++;
			}
			if (varriable.length() - k > +k) {
				finalStr = finalStr + varriable + " ";
			}
		}

		return finalStr;
	}

	public void showResult(String resultText) {
		System.out.print(resultText);
	}

}
