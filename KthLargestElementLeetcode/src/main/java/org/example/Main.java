package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example input
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        // Expected answer : 4, head to src/main/test/SolutionTest.java for more UTs
        System.out.println(k + "th largest element on the list using the first method is : " + Solution.findKthLargest_V1(nums, k));
        System.out.println(k + "th largest element on the list using the second method is : " + Solution.findKthLargest_V2(nums, k));
    }
}