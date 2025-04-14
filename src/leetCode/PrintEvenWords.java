package leetCode;

public class PrintEvenWords {

	public static void main(String[] args) {

		String inputText = "Sky is blue and vast";
		String[] wordsArray = inputText.split(" ");
		for (String currentWord : wordsArray) {
			if ((currentWord.length() & 1) == 0) {
				System.out.println(currentWord);
			}
		}
	}
}