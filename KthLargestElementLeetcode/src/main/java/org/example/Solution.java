package org.example;

import java.util.*;

public class Solution {
    public static int findKthLargest_V1(int[] nums, int k) {
        List<Integer> sortedNums = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toList();

        return sortedNums.get(k-1);
    }

    public static int findKthLargest_V2(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->(a-b));

        for(int i : nums)
        {
            pq.offer(i);

            if(pq.size() > k)
            {
                pq.poll();
            }
        }

        return pq.poll();
    }
}
