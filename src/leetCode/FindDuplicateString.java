package leetCode;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Set;

public class FindDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits = { "apple", "mango", "Apple", "grapes", "strawberry" , "Mango"};

		List<String> duplicateStrings = findDuplicates(fruits);

		System.out.println("Duplicate strings in the array are: " + duplicateStrings);
	}

	public static List<String> findDuplicates(String[] arr) {
		Set<String> set = new HashSet<>();
		List<String> duplicates = new ArrayList<>();

		for (String str : arr) {
			String lowerCaseStr = str.toLowerCase();
			if (!set.add(lowerCaseStr)) { // If set.add() returns false, it means the element is already in the set
				duplicates.add(str);
			}
		}

		return duplicates;
	}
}