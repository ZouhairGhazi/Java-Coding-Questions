package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * returns the wanted result
     *
     * @param s a string
     * @return the minimum number of deletions
     */
    public static int getMinDeletions(String s) {

        Set<Character> setS = new HashSet<>();

        for (char c:s.toCharArray()) {
            setS.add(c);
        }

        return s.length() - setS.size();

    }
}
