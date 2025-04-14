package string;

public class FrequencyOfLettersInStringUsingArray {
	public static void main(String[] args) {
		String stringToCheck = "India is My Country";
		long startTimeForLoop = System.nanoTime();
		checkAndPrintFrequency(stringToCheck);
		long endTimeForLoop = System.nanoTime();
		long durationForLoop = (endTimeForLoop - startTimeForLoop);
		System.out.println("Time taken (For Loop): " + durationForLoop + " nanoseconds");
	}

	public static void checkAndPrintFrequency(String stringToCheck) {
		// Assuming ASCII characters, there are 128 possible characters
		int[] frequency = new int[128];

		// Convert string to char arrays
		char[] chars = stringToCheck.toCharArray();

		// Iterate over each character
		for (char c : chars) {
			// Ignore non-alphabetic characters
			if (Character.isLetter(c)) {
				// Convert to lowercase to ignore case
				// c = Character.toLowerCase(c);
				// Increment the frequency count for the character
				frequency[c]++;
			}
		}

		// Print frequency of each character
		for (char c = 0; c <= 128; c++) {
			if (Character.isLetter(c) && frequency[c] > 0) {
				System.out.println(c + ": " + frequency[c]);
			}
		}
	}
}
