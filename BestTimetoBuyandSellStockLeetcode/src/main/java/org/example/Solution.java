package org.example;

public class Solution {

    public static int maxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;
        int l = 0, r = 1;
        int profit = 0;
        while (r < prices.length) {
            if (prices[r] > prices[l]) {
                profit = Math.max(profit, prices[r] - prices[l]);
            }
            else
                l = r;
            r++;
        }
        return profit;
    }
}
