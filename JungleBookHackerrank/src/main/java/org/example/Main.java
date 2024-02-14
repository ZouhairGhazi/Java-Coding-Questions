package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Example input
        List<Integer> predators = List.of(2, -1, 3, 4, -1, 0);

        // Expected answer : 5, head to src/main/test/SolutionTest.java for more UTs
        System.out.println("Minimum number of groups: " + Solution.minGroups(predators));
    }
}