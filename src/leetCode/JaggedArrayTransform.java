package leetCode;

import java.util.*;

public class JaggedArrayTransform {
    public static void main(String[] args) {

        int[][] input = { { 1, 1 }, { 1, 2, 3 }, { 1, 2, 3, 4 }, {5,6,7,8,9} };


        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int[] row = input[i];

            if (i == 0) {
                // First row: add only the first element if it exists
                if (row.length > 0) {
                    result.add(row[0]);
                }
            } else if (i == 1) {
                // Second row: add from index 1 onwards and then add their sum
                int sum = 0;
                for (int j = 1; j < row.length; j++) {
                    result.add(row[j]);
                    sum += row[j];
                }
                result.add(sum);
            } else {
                // From 3rd row onwards: add from index = i
                for (int j = i; j < row.length; j++) {
                    result.add(row[j]);
                }
            }
        }

        System.out.println("Result: " + result);
    }
}
