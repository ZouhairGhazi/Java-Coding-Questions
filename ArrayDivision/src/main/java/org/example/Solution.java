package org.example;

import java.util.List;

public class Solution {

    public static int divideArray(List<Integer> nums) {

        int n = nums.size();
        if (n % 2 == 0)
            throw new IllegalArgumentException("The array's length should not be a pair number");

        int sumL = 0, sumR = nums.stream().mapToInt(Integer::intValue).sum() - nums.get(0);

        for (int i = 1; i < n - 1; i++) {
            sumL += nums.get(i - 1);
            sumR -= nums.get(i);

            if (sumL == sumR)
                return i;
        }

        return -1; // There was no possible partition of the array respecting the given condition
    }
}
