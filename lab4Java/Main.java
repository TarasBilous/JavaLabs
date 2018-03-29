import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		StringProcessor processor = new StringProcessor();
		String str = processor.readInputText();
		processor.showResult(processor.processText(str));

	}
}
