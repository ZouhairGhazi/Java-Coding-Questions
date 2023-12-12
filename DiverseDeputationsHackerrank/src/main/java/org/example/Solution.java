package org.example;
public class Solution {

    /**
     * Calculates the combination (n choose k).
     *
     * A method that calculates the value of nCr = !n / (!k * (n-k)!), using the fact that
     * !n / (n-k)! = n * (n-1) * (n-2) * ... * (n-k+1), the idea is that we keep continuously dividing
     * so that we avoid the overflow problems that arise if we try to calculate using factorial.
     *
     * @param n the total number of items.
     * @param k the number of items to choose.
     * @return the number of ways to choose k items from n items.
     * @throws IllegalArgumentException if n is less than k.
     */
    public static int combination (int n, int k){
        if (n < k) {
            return 0;
        }
        int result = 1;
        int i = 1;
        while (i <= k) {
            result *= (n - k + i);
            result /= i;
            i++;
        }
        return result;
    }

    /**
     * returns the wanted result
     *
     * @param m the total number of men.
     * @param w the total number of women.
     * @return the total number of possible groups using the combination helper method declared above
     */
    public static int diverseReputation(int m, int w) {
        if (Math.min(m, w) == 0 || m + w < 3)
            return 0;
        return combination(m, 2) * combination(w, 1) + combination(m, 1) * combination(w, 2);
    }
}

