package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static Integer maxSubArray(int[] nums) {

        int sumTotal = nums[0];
        int currentOffset = 0;

        for (int i = 1; i < nums.length; i++) {
            int subSumTotal = sumTotal;
            if (nums[i] > sumTotal) {
                sumTotal = nums[i];
                currentOffset = i;
            } else {
                if (nums[i] + sumTotal > sumTotal) {
                    while (currentOffset < i) {
                        currentOffset = currentOffset + 1;
                        subSumTotal = subSumTotal + nums[currentOffset];
                    }
                    if (subSumTotal > sumTotal) {
                        sumTotal = subSumTotal;
                        currentOffset = i;
                    }
                }
            }
        }
        return sumTotal;
    }

}
