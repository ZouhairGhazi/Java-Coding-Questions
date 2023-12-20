package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Long> mapOcc = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        TreeMap<Integer, Long> treeMap = new TreeMap<>(
                (a, b) -> {
                    int compare = mapOcc.get(b).compareTo(mapOcc.get(a));
                    if (compare != 0)
                        return compare;
                    return b.compareTo(a);

        });

        treeMap.putAll(mapOcc);

        return treeMap.keySet().stream()
                .limit(k)
                .mapToInt(Integer::intValue)
                .toArray();

    }
}
