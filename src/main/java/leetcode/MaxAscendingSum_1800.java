package leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaxAscendingSum_1800 {
    
    public static void main(String[] args) {
        MaxAscendingSum_1800 obj = new MaxAscendingSum_1800();
        int[] nums = {10,20,30,5,10,50};
        int[] nums2 = {12,17,15,13,10,11,12};
        log.info("{} >>>> {}", nums, obj.maxAscendingSum(nums));
        log.info("{} >>>> {}", nums2, obj.maxAscendingSum(nums2));
    }

    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int sumArrSum = nums[0];

        for(int i = 1; i < nums.length; i++ ) {
            if(nums[i] > nums[i-1]) {
                sumArrSum += nums[i];
            } else {
                sumArrSum = nums[i];
            }
            maxSum = Math.max(maxSum, sumArrSum);
        }

        return maxSum;
    }

}
