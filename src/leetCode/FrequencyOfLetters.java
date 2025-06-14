package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfLetters {

	public static void main(String[] args) {

		String query = "India is My Country";

		Map<Character, Long> calculated = query.chars().filter(Character::isAlphabetic).mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("**********************Using Streams**************");
		System.out.println("Frequency of letters  : " + calculated);

		

		Map<Character, Integer> frequencyMap = new HashMap<>();
		for (char c : query.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println("**********************Using loop**************");
		System.out.println("Frequency of letters: " + frequencyMap);
	}
}