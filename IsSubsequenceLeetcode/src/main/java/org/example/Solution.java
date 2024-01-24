package org.example;

public class Solution{

    public static boolean isSubsequence(String s, String t) {

        int counterS = 0;
        int counterT = 0;

        while (counterS < s.length() && counterT < t.length()) {
            if (s.charAt(counterS) == t.charAt(counterT)) {
                counterS++;
            }
            counterT++;
        }

        return counterS == s.length();
    }
}
