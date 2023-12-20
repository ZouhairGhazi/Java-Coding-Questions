package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example input
        List<Integer> nums = List.of(7, 4, 6, 1, 8, 9, 9);

        // Expected answer : 4, head to src/main/test/SolutionTest.java for more UTs
        System.out.println("Division can be done at index: " + Solution.divideArray(nums));
    }
}