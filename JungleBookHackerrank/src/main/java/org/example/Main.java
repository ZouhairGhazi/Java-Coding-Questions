package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Example input
        List<Integer> predators = List.of(-1, 0, 1, -1, 3);

        // Expected answer : 3, head to src/main/test/SolutionTest.java for more UTs
        System.out.println("Minimum number of groups: " + Solution.minGroups(predators));
    }
}