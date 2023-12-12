package org.example;

import java.util.Collections;
import java.util.List;

public class Solution {

    /**
     * returns the wanted result
     *
     * @param weight a list of floats
     * @return the minimum number of trips
     * @throws IllegalArgumentException if a weight value is not between 1.01 and 3.00
     */
    public static int efficientJanitor(List<Float> weight) {
        checkInput(weight);
        weight.sort(Collections.reverseOrder());
        int result = 0;
        int l = 0, r = weight.size() - 1;
        while (l <= r) {
            if (weight.get(l) + weight.get(r) <= 3) {
                r--;
            }
            result++;
            l++;
        }
        return result;
    }

    private static void checkInput(List<Float> weight) {
        boolean isInError = weight.stream().anyMatch(x -> x < 1.01F || x > 3.00);
        if (isInError) {
            throw new IllegalArgumentException("A weight float value must be between 1.01 and 3.00");
        }
    }
}
