package leetCode;

import java.util.Arrays;
import java.util.List;

public class SortStringByAscendingOrder {
    public static void main(String[] args) {

        // List
        List<String> names = List.of("Vishal", "jain", "ramesh", "suresh", "arun");

        names.stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

        System.out.println("*********************Using Array***************************");
        String [] name = {"Vishal", "jain", "ramesh", "suresh", "arun"};

        Arrays.asList(name).stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);
    }
}
