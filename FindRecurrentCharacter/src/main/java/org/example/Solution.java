package org.example;

public class Solution {

    public static boolean findRecurrent(String s, int n) {
        if (s.length() < n)
            throw new IllegalArgumentException("String length must be bigger than n");
        if (s.length() == 1 || n == 1)
            return true;
        int l = 0, r = 1;
        int count = 1;
        while (r < s.length() && count < n) {
            if (s.charAt(l) == s.charAt(r)) {
                count++;
                r++;
            }
            else {
                l = r;
                r++;
                count = 1;
            }
        }
        return count == n;
    }
}
