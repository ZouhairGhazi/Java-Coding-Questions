package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int result = Solution.efficientJanitor(Arrays.asList(1.01F, 1.99F, 2.5F, 1.5F, 1.01F));
        System.out.println(result); // Expected answer : 3, head to src/main/test/SolutionTest.java for more UTs
    }
}