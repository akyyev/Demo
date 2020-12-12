package com.demo.Interview_Questions;

import java.util.Arrays;

public class Array_get_second_max {
    public static void main(String[] args) {
        System.out.println(getSecondMax(new int[]{60,200,3,4,500}));
        System.out.println(getSecondMax(new int[]{500, 50, 100,1, 3}));
        System.out.println(getSecondMax2(new int[]{0, 500, 500, 100}));
        System.out.println(getSecondMax2(new int[]{200, 100}));
        System.out.println(getSecondMax2(new int[]{4, 3, 5}));
        System.out.println(getSecondMax2(new int[]{4, 4, 4})); // should throw exception

        int[] arr = new int[20];

        //Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[19]);
    }

    private static int getSecondMax(int[] arr) {
        // If you think array contains only 2 elements then max will be one of them
        // and min will give us second max.
        int max = Integer.max(arr[0], arr[1]);
        int sec = Integer.min(arr[0], arr[1]);

        // To compare max and second max with the rest of the elements we use for loop
        for(int num : arr){
            if(num>max) {
                // If element is greater than max, first of all we assign value of max to second_max then
                // assign that element to max
                sec = max;
                max = num;
            } else if(num>sec && num != max){
                sec = num;
            }
        }
        return sec;
    }

    private static int getSecondMax2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>max){
                sec = max;
                max = num;
            }else if(num>sec && num != max){
                sec = num;
            }
        }
        if(sec == Integer.MIN_VALUE) {
            throw new RuntimeException("There is no second max!");
        }
        return sec;
    }

}
