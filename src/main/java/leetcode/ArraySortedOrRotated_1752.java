package leetcode;

public class ArraySortedOrRotated_1752 {
    public static void main(String[] args) {
        ArraySortedOrRotated_1752 obj = new ArraySortedOrRotated_1752();
        int[] nums = {3,4,5,1,2,3,3};
        System.out.println(obj.check(nums));
    }

    public boolean check(int[] nums) { 
        int vCount = 0;

        // count the number of valleys
        for (int i = 0; i < nums.length - 1; i++) if(nums[i+1] - nums[i] < 0) vCount++;
        
        // if there is only 1 valley, then the array is sorted
        if(vCount == 1) return nums[nums.length - 1] <= nums[0];

        // if there are more than 1 valleys, then the array is not sorted
        if(vCount > 1) return false;

        return true;
    }
}
