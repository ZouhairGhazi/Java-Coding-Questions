package org.example;

public class Main {
    public static void main(String[] args) {
        // Example input
        String exampleString =  "ABCACB";
        int n = 2;

        // Expected answer : true, head to src/main/test/SolutionTest.java for more UTs
        System.out.println(Solution.findRecurrent(exampleString, n));
    }
}