package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum {
	public static void main(String[] args) {

		int nums[] = { 2, 7, 11, 15 };
		int target = 22;
		boolean found = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println(nums[i] + "  " + nums[j]);
					found = true; // set found to true if a match is found
					break;
				}
			}
			if (found)
				break; // exit the outer loop if a match is found
		}
		if (!found) { // if no match is found after checking all pairs
			System.out.println("No Match Found");
		}
	}
}
// using hashmap
// Create a HashMap to store the elements and their indices
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0; i < nums.length; i++) {
//			

//			int x = target - nums[i];

//			// Check if the X is already in the map
//			if(map.containsKey(x)) {
// Print the indices of the pair
//				System.out.println(map.get(x) + "  " + i);
//				}
//
// Put the current element and its index in the map
//				map.put(nums[i], i);
//				
//		}
// Using Streams
//		IntStream.range(0, nums.length).boxed()
//				.flatMap(i -> IntStream.range(i + 1, nums.length).filter(j -> nums[i] + nums[j] == target)
//						.mapToObj(j -> new int[] { i, j }))
//				.forEach(pair -> System.out.println(pair[0] + " " + pair[1]));
//
//	}		
//}
