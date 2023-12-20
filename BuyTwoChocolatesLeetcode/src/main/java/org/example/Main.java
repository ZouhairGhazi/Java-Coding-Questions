package org.example;

public class Main {
    public static void main(String[] args) {
        // Example input
        int[] nums = {3, 2 ,4};
        int money = 6;

        // Expected answer : 1, head to src/main/test/SolutionTest.java for more UTs
        System.out.println("Leftover money using the first method is : " + Solution.buyChoco_V1(nums, money));
        System.out.println("Leftover money using the second method is : " + Solution.buyChoco_V2(nums, money));
    }
}