package org.example;

public class Main {
    public static void main(String[] args) {
        // Example input
        int low = 200, high = 405;

        // Expected answer : [375, 225, 405, 243], head to src/main/test/SolutionTest.java for more UTs
        System.out.println("Division can be done at index: " + Solution.findNumbers(low, high));
    }
}