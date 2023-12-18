package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example input
        int[] nums = {2,7,11,15};
        int target = 9;

        // Expected answer : true, head to src/main/test/SolutionTest.java for more UTs
        System.out.println(Arrays.toString(Solution.twoSum(nums, target)));
    }
}