package leetCode;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOnlyCapsFromString {

	public static void main(String[] args) {

		String toCheck = "India IS My Country";

		Map<Boolean, Long> output = toCheck.chars().filter(Character::isAlphabetic).boxed()
				.collect(Collectors.partitioningBy(Character::isUpperCase, Collectors.counting()));

		System.out.println("Number of Upper case letters  ->" + output.get(true));
		System.out.println("Number of Lower case letters  -> " + output.get(false));
	}

}
