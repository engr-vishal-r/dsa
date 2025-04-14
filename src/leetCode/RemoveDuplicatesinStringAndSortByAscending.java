package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesinStringAndSortByAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fruits[] = { "banana", "apple", "citrus", "rasp", "Apple", "strawberry" };

		List<String> list = Arrays.asList(fruits);
		
		// Convert to lowercase and remove duplicates
        Set<String> uniqueFruit = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        uniqueFruit.addAll(list);

        // Sort the unique elements
        for (String fruit : uniqueFruit) {
            System.out.println(fruit);
        }

        System.out.println("************************");
		Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		for (String fruit : list) {
			System.out.println(fruit);

		}
		System.out.println("************************");
		// Use distinct() to remove duplicates and collect the unique values into a list
		List<String> uniqueFruits = list.stream()
				.map(String::toLowerCase)
				.distinct()
				.collect(Collectors.toList());

		// Print the unique fruits
		uniqueFruits.forEach(System.out::println);
	}

	
}

