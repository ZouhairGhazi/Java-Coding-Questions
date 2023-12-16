package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Example input
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("cherry", 30);
        map.put("date", 20);

        // Expected answer : [banana, date], head to src/main/test/SolutionTest.java for more UTs
        System.out.println(Solution.findByValue(map, 20));
    }
}