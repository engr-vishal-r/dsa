package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "India is My Country";

		long startTimeStream = System.nanoTime();
		Map<Character, Long> calculated = S.chars().filter(Character::isAlphabetic).mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Frequency of letters  : " + calculated);
		long endTimeStream = System.nanoTime();
		long durationStream = (endTimeStream - startTimeStream);
		System.out.println("Time taken (Stream): " + durationStream + " nanoseconds");

		
		long startTimeForLoop = System.nanoTime();
		Map<Character, Integer> frequencyMap = new HashMap<>();
		for (char c : S.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println("Frequency of letters: " + frequencyMap);
		long endTimeForLoop = System.nanoTime();
		long durationForLoop = (endTimeForLoop - startTimeForLoop);
		System.out.println("Time taken (For Loop): " + durationForLoop + " nanoseconds");
	}
}