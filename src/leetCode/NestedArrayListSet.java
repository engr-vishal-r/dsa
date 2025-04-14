package leetCode;

import java.util.*;

public class NestedArrayListSet {
	public static void printElements(List<List<Integer>> nestedList) {
        for (List<Integer> tuple : nestedList) {
            System.out.print(tuple.get(2) + " ");
        }
        System.out.println(); // Adding a newline after printing the elements
    }

    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        a.add(Arrays.asList(1, 0, 2));
        a.add(Arrays.asList(2, 0, 4));
        a.add(Arrays.asList(3, 0, 5));

        System.out.print("Output elements: ");
        printElements(a);
    }
}
