package leetcode;

public class LongoestMonotonicSubArray_3105 {
    public static void main(String[] args) {
        LongoestMonotonicSubArray_3105 obj = new LongoestMonotonicSubArray_3105();
        int[] nums = {2,1,10};
        System.out.println(obj.longestMonotonicSubArray(nums));
    }

    public int longestMonotonicSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int incLength = 1;
        int decLength = 1;
        int max = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                incLength++;
                decLength = 1;
            } else if (nums[i] < nums[i - 1]) {
                decLength++;
                incLength = 1;
            } else {
                incLength = 1;
                decLength = 1;
            }
            max = Math.max(max, Math.max(incLength, decLength));
        }
        return max;
    }
}