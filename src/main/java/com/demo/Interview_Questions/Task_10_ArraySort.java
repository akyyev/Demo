package com.demo.Interview_Questions;

import java.util.Arrays;

public class Task_10_ArraySort {

    /**
     * Sort an array without using Sort method() { Arrays.sort(arr)}
     * Bubble sort
     * Time complexity O(n^2)
     * Space complexity O(1)
     *
     */
    public static void main(String[] args) {
        int [] arr = {10, 5, 8, 1};
        System.out.println(Arrays.toString(sortDesc(arr)));

        arr = createArray(10);
        System.out.println(Arrays.toString(sortAsc(arr)));
    }

    /**
     * Our strategy will be to compare first with rest of the arr elements.
     * if first is greater than second or third then just swap their places.
     * int [] arr = {10, 5, 8, 1};
     * Here is how execution happens:
     * Starting with 10     i      j
     *      5, 10, 8, 1     0      1
     *      5, 10, 8, 1     0      2
     *      1, 10, 8, 5     0      3
     *      1, 8, 10, 5     1      2
     *      1, 5, 10, 8     1      3
     *      1, 5, 8, 10     2      3
     */
    private static int[] sortAsc(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]) {
                    //just swapping numbers
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] sortDesc(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]) {
                    //just swapping numbers
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] createArray(int size){
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = (int) (Math.random()*size*size);
        }
        return arr;
    }

}
