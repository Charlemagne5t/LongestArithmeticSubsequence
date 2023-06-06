package org.example;

import java.util.*;

public class Solution {
    public int longestArithSeqLength(int[] nums) {
        List<HashMap<Integer, Integer>> dp = new ArrayList<>();
        int max = 2;
        for (int i = 0; i < nums.length; i++) {
            dp.add(new HashMap<>());
            for (int j = 0; j < i; j++) {
                int difference = nums[i] - nums[j];
                int count = 2;

                if (dp.get(j).containsKey(difference)) {
                    count = dp.get(j).get(difference) + 1;
                    max = Math.max(max, count);
                }
                dp.get(i).put(difference, count);
            }
        }
        return max;
    }
}
