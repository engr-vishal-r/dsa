package leetCode;

import java.util.*;

public class SubsetGenerator { 
	 
    public static List<List<Integer>> generateSubsets(int[] nums) { 
        List<List<Integer>> subsets = new ArrayList<>(); 
        generateSubsets(nums, 0, new ArrayList<>(), subsets); 
        return subsets; 
    } 
 
    private static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) { 
        if (index == nums.length) { 
            subsets.add(new ArrayList<>(current)); 
            return; 
        } 
        // Include the current element 
        current.add(nums[index]); 
        generateSubsets(nums, index + 1, current, subsets); 
        // Exclude the current element 
        current.remove(current.size() - 1); 
        generateSubsets(nums, index + 1, current, subsets); 
    }
 
    public static void main(String[] args) { 
        int[] nums = {1, 2, 3}; 
        List<List<Integer>> allSubsets = generateSubsets(nums); 
        System.out.println(allSubsets); 
    } 
} 
