package org.example;

public class Main {
    public static void main(String[] args) {
        // Example input
        String s1 = "ABC", s2 ="ABCABC";

        // Expected answer : 4, head to src/main/test/SolutionTest.java for more UTs
        System.out.println("Number of occurences is: " + Solution.countOccurences(s1, s2));
    }
}