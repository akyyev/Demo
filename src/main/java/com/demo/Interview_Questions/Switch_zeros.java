package com.demo.Interview_Questions;

import com.demo.OCA.Search_Sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Switch_zeros {

    int age;
    protected String name;
    private boolean isOld;
    public byte zeroOrOne;


    /*
    Switch zeros in Array and keep other number’s order. Can not use sort  int [] nums={0,0,8,0,5,9,2};
     */

    public static void main(String[] args) {
        int [] nums={0,0,8,0,5,9,2,0};

        ArrayList<Integer> list = new ArrayList<>();

        for(int each: nums){
            if(each==0) list.add(each);
        }

        for(int each: nums){
            if(each!=0) list.add(each);
        }

        for(int i=0; i<nums.length; i++){
            nums[i]=list.get(i);
        }

        System.out.println(list);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString( pushZerosToFront2(nums)));
        System.out.println(Arrays.toString( pushZerosToEnd(nums)));

    }


    public static int[] pushZerosToFront(int[] arr){
        int count=0;
        int [] arr2 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0) arr2[count++]=arr[i];
        }
        int a=0;
        while (a<count-1){
            arr[a++]=0;
        }
        int m=0;
        while (a<arr.length){
            arr[a++]=arr2[m++];
        }
        return arr;
    }

    public static int[] pushZerosToFront2(int[] arr){
        int count=0;
        int [] arr2 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0) arr2[count++]=arr[i];
        }

        int m=0;
        for(int i=0; i<arr.length; i++){
            if(count>i) arr[i]=0;
            else arr[i]=arr2[m++];
        }
        return arr;
    }

    public static int[] pushZerosToEnd(int[] arr){
        int count=0;

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0) arr[count++]=arr[i]; // here count is incremented
        }
            // Now all non-zero elements have been shifted to
            // front and 'count' is set as index of first 0.
            // Make all elements 0 from count to end.
            while (count < arr.length)
                arr[count++] = 0;

        return arr;
    }

}
