package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example input
        int[] nums = {1,1,1,2,2,3,3};
        int k = 2;

        // Expected answer : 4, head to src/main/test/SolutionTest.java for more UTs
        System.out.println(k + " most occurent elements are : " + Arrays.toString(Solution.topKFrequent(nums, k)));
    }
}