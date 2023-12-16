package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public static List<String> findByValue(Map<String, Integer> stringMap, int x) {

        return stringMap.entrySet().stream()
                .filter(entry -> entry.getValue() == x)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
