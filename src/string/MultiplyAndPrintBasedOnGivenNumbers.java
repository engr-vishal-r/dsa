package string;

public class MultiplyAndPrintBasedOnGivenNumbers {

	public static void main(String[] args) {
		String input = "a12b3";
		String output = expandString(input);
		System.out.println("Output: " + output);
	}

	public static String expandString(String input) {
		StringBuilder expanded = new StringBuilder();
		int index = 0;
		while (index < input.length()) {
			char ch = input.charAt(index);
			index++; // Move to the next character
			int count = 0;
			while (index < input.length() && Character.isDigit(input.charAt(index))) {
				count = count * 10 + (input.charAt(index) - '0');
				index++; // Move to the next digit
			}
			// Repeat the character 'count' times
			for (int i = 0; i < count; i++) {
				expanded.append(ch);
			}
		}
		return expanded.toString();
	}
}