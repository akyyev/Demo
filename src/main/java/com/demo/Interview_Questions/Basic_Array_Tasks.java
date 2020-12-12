package com.demo.Interview_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Basic_Array_Tasks {

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,0,3,0,0,4};
        System.out.println(Arrays.toString(moveZerosToFront(arr)));
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));

        //Find first duplicate: [1, 2, 4, 4, 1, 3, 7, 5, 5, 2]
        arr = new int[]{1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
        System.out.println(findFirstDup(arr));


        int[] a = {1,3,5,6,7,11,12};
        int[] b = {0,2,4,8,9,10};
        System.out.println(Arrays.toString(merge(a,b)));
    }

    /**
     * Takes two sorted arrays and merges them
     * @param a
     * @param b
     * @return
     */
    private static int[] merge(int[] a, int[] b) {
        int[] merge = new int[a.length+b.length];

        int i=0, j=0, k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]) merge[k++] = a[i++];
            else merge[k++] = b[j++];
        }

        while(i<a.length){
            merge[k++] = a[i++];
        }

        while (j < b.length) {
            merge[k++] = b[j++];
        }
        return merge;
    }


    private static int findFirstDup(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int each: arr){
            if(!set.add(each)) return each;
        }
        return -1;
    }

    private static int[] moveZerosToEnd(int[] arr){
        int n = arr.length;
        int c=0;
        // iterating over arr if element is not zero start assigning from first index;
        // c is for counting how many non-zeros we have in the array.
        for(int each: arr){
            if(each!=0) {
                arr[c++] = each;
            }
        }
        // assign zero starting from index=c, because we had c non-zero elements.
        while(c<n){
            arr[c++]=0;
        }
        return arr;
    }

    private static int[] moveZerosToFront(int[] arr){
        int c=0;
        int ind = arr.length-1;
        for(int i=ind; i>=0; i--) {
            if (arr[i] != 0) {
                arr[ind] = arr[i];
                ind--;
                c++;
            }
        }
        int m=0;
        while(m<arr.length-c){
            arr[m]=0;
            m++;
        }
        return arr;
    }

}
