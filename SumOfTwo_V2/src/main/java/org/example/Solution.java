package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!diffMap.containsKey(target - nums[i]))
                diffMap.put(nums[i], i);
            else
                return new int[]{diffMap.get(target - nums[i]), i};
        }

        return new int[]{-1};
    }
}
