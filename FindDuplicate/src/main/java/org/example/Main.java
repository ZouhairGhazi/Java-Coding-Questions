package org.example;

public class Main {
    public static void main(String[] args) {
        // Example input
        char[] exampleString =  {'A', 'B', 'C', 'A', 'X', 'B'};

        // Expected answer : [A, B], head to src/main/test/SolutionTest.java for more UTs
        System.out.println(Solution.findDuplicates(exampleString));
    }
}