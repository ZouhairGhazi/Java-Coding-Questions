package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static boolean twoSum(int[] nums, int target) {

        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            if (seenNumbers.contains(target - num)) {
                return true;
            }
            seenNumbers.add(num);
        }

        return false;

    }
}
