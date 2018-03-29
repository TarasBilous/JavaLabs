import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

	public String readInputText() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		return br.readLine();

	}

	public String processText(String inputText) {
		String finalStr = new String();
		String[] strArray = inputText.split(" ");
		Pattern p = Pattern.compile("[aeyuoi]", Pattern.CASE_INSENSITIVE);

		for (String varriable : strArray) {
			Matcher matcher = p.matcher(varriable);
			int loudLettersCount = 0;
			while (matcher.find()) {
				loudLettersCount++;
			}
			if (varriable.length() - loudLettersCount >= loudLettersCount) {
				finalStr = finalStr + varriable + " ";
			} else {
				System.out.println(" " + varriable);
			}
		}
		System.out.println("");
		System.out.println("");
		return finalStr;
	}

	public void showResult(String resultText) {
		System.out.print(resultText);
	}

}
