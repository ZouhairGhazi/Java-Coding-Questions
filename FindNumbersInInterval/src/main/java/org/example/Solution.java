package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findNumbers(int low, int high) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; Math.pow(3, i) <= high; i++){
            for (int j = 0; Math.pow(3, i) * Math.pow(5, j) <= high; j++) {
                int current = (int)(Math.pow(3, i) * Math.pow(5, j));
                if (current >= low && current <= high)
                    result.add(current);
            }
        }

        return result;
    }
}
