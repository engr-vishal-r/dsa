package string;

import java.util.*;

public class FrequencyOfLettersInStringUsingMap {

	public static void main(String[] args) {

		String stringToCheck = "India is My Country";

		FrequencyOfLettersInStringUsingMap fols = new FrequencyOfLettersInStringUsingMap();
		fols.checkAndPrintFrequency(stringToCheck);
	}
	
	public static void checkAndPrintFrequency(String stringToCheck) {
		
		// Map to store character frequency
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Convert string to char array
        char[] chars = stringToCheck.toCharArray();

        // Iterate over each character
        for (char c : chars) {
            // Ignore non-alphabetic characters
            if (Character.isLetter(c)) {
                // Convert to lowercase to ignore case
                c = Character.toLowerCase(c);
                // Update frequency map
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }
        // Sort the frequency map by keys
        Map<Character, Integer> sortedFrequencyMap = new TreeMap<>(frequencyMap);


        // Print frequency of each character
        for (Map.Entry<Character, Integer> entry : sortedFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}