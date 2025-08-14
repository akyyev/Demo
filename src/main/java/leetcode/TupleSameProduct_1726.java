package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TupleSameProduct_1726 {
    
    public static void main(String[] args) {
        TupleSameProduct_1726 obj = new TupleSameProduct_1726();
        int[] nums = {1,2,4,5,10};
        log.info("nums: {}, tuples with same product count: {}", Arrays.toString(nums), obj.tupleSameProduct(nums));
    }


    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int prod = nums[i] * nums[j];
                res += 8 * map.getOrDefault(prod, 0);
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }
        
        return res;
    }
}
