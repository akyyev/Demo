package com.demo.Interview_Questions;

import java.util.Arrays;

public class Task_11_sum_up_to_zero {

    public static void main(String[] args) {
        int size = 6;
        int[] arr = unique(size);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    private static int[] unique(int size){
        int[] arr = new int[size];
        int total = 0;
        for(int i=0; i<size-1; i++){
            arr[i] = i-1;
            total +=i-1;
        }
        arr[size-1] = -total;
        return arr;
    }
}
