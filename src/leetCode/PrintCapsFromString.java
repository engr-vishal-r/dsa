package leetCode;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintCapsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String toCheck = "India IS My Country";

		Map<Boolean, Map<Character, Long>> output = toCheck.replaceAll("\s+", "").chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.partitioningBy(Character::isUpperCase,
						Collectors.groupingBy(Function.identity(), Collectors.counting())));

		System.out.println("Number of Upper case letters  ->" + output.get(true));
		System.out.println("Number of Lower case letters  -> " + output.get(false));

	}

}
