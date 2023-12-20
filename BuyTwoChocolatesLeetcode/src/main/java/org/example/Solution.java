package org.example;

import java.util.Arrays;

public class Solution {

    // Complexity : O(nlogn)
    public static int buyChoco_V1(int[] prices, int money) {
        prices = Arrays.stream(prices).sorted().toArray();
        return (prices[0] + prices[1] <= money) ? money - (prices[0] + prices[1]) : money;
    }

    // Complexity : O(n)
    public static int buyChoco_V2(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            }
            else if (price < min2) {
                min2 = price;
            }
        }
        return (min1 + min2 <= money) ? money - (min1 + min2) : money;
    }
}
