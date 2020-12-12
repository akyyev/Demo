package com.demo.replits;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Repl_115_array_max {
    /**
     * Given an array num, get the max number in nums and print out to console.
     * nums → [2, 4, 2, 3, -2]) → 4
     * nums → [2, 2, 5, 3, 0 ]) → 5
     * nums → [1, 33, 5, 7, 9]) → 33
     */

    public static void main(String[] args) {
        int[] arr = {2,4,3, 6, 9,1,10,-12};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max = arr[i];
        }

        System.out.println("Using for loop: "+ max);

        Arrays.sort(arr);
        System.out.println("Without using for loop: "+ arr[arr.length-1]);



    }

}
