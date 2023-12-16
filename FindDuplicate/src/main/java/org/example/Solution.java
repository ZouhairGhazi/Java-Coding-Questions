package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public static char[] findDuplicates(char[] charArray) {

        Map<Character, Integer> occMap = new HashMap<>();
        for (Character c:charArray) {
            if (occMap.containsKey(c)) {
                occMap.replace(c, occMap.get(c) + 1);
            }
            else {
                occMap.put(c, 1);
            }
        }

        List<Character> result = occMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        return String.valueOf(result).toCharArray();

    }
}
