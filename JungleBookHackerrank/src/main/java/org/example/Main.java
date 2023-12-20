package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Example input
        List<Integer> predators = List.of(-1, 8, 6, 0, 7, 3, 8, 9, -1, 6, 1);

        // Expected answer : 5, head to src/main/test/SolutionTest.java for more UTs
        System.out.println("Minimum number of groups: " + Solution.minGroups(predators));
    }
}