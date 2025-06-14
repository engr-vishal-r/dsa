package leetCode;

import java.util.*;

public class MostFrequentElement {

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 4, 5, 1, 2, 3};

        Map<Integer, Integer> freqMap = new HashMap<>();

        int maxCount = 0;
        int mostFrequent = nums[0];

        for (int num : nums) {
            int count = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = num;
            }
        }

        System.out.println("Most frequent element: " + mostFrequent);
        System.out.println("Frequency: " + maxCount);
    }
}
