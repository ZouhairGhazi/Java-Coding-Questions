package org.example;

public class Main {
    public static void main(String[] args) {
        // Example input
        String s = "abc";
        String t = "ahbgdc";

        // Expected answer : true, head to src/main/test/SolutionTest.java for more UTs
        System.out.println(Solution.isSubsequence(s, t) ?"s is a subsequence of t" : "s is not a subsequence of t");
    }
}