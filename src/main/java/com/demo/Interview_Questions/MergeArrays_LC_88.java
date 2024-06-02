package com.demo.Interview_Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class MergeArrays_LC_88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // nums1 = [1,2,3,0,0,0],    m = 3,
        //.             p2    p3
        // nums2 = [2,5,6],          n = 3
        //.             p1

        // p2 = 3,
        int p1 = n-1;
        int p2 = m-1;
        int p3 = nums1.length;

        // start from end, 3 pointers (p1, p2, p3)

        if(nums2.length == 0) return;
        if(m==0) {
            nums1 = nums2;
            System.out.println(Arrays.toString(nums1));
            return;
        }

        Stack<String> stack = new Stack<>();

        for(int i = p3 - 1; i>= 0; i--) {
            if(nums1[p2]>nums2[p1]) {
                nums1[i] = nums1[p2];
                p2--;
            } else {
                nums1[i] = nums2[p1];
                p1--;
            }
            if(p1 == -1 || p2 == -1) {
                break;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        merge(new int[]{0}, 0, new int[]{1}, 1);
        var num = new int[]{0};
        merge(num, 0, new int[]{1}, 1);
        System.out.println("Arrays.toString(num) = " + Arrays.toString(num));

        System.out.println("Math.pow(10, 2) = " + Math.pow(10, 2));

        System.out.println(Arrays.toString("1.2.3".split("\\.")));
    }
}
 class CompoundAssignment {
    public static void main(String[] args) {
        int x = 1;
        x +=  (x + 1) * (x = 4) ;
        System.out.println("x = " + x);
    }
}
