package data.coding.twoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumTarget {

    public static void main(String[] args) {
        //           0 1 2 3 4
        int[] arr = {1,4,3,9,6};
        var target = 10; // return index of 1 & 9 => [0,3]

        System.out.println(Arrays.toString(getTwoSumTarget(arr, target)));

    }

    public static int[] getTwoSumTarget(int[] arr, int target) {
        //              0 1 2 3 4
        // int[] arr = {1,4,3,9,6};
        // var target = 10;
        // return index of 1 & 9 => [0,3]

        // can be easily solved with creating a hashmap O(n)
        var map = new HashMap<Integer, Integer>();
        for(var i = 0; i < arr.length; i++ ) {
            map.put(arr[i], i);
        }
        /*
            map k -- v
                1    0
                4    1
                3    2
                9    3
                6    4
          Now check which diff value exist as a key
        */
        for(var i = 0; i < arr.length; i++ ) {
            var diff = target-arr[i];
            if(map.containsKey(diff)) {
                return new int[] {i, map.get(diff)};
            }
        }

        throw new RuntimeException("Sum of two numbers will never be target number!");
    }


}
