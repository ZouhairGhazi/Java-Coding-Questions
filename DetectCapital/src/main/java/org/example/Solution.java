package org.example;

public class Solution {

    public static boolean detectCapitalUse(String word) {
        return word.matches("([A-Z]+|[a-z]+|[A-Z][a-z]*)");
    }
}
