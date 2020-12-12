package com.demo.Interview_Questions;

import java.util.Scanner;

public class Loop_through_array {

    /**
     * you're given a method that takes an n integer and arr[] int array. and it returns int
     * n is the number of values in the array.
     * the method should return the last two digits multiplication of the values in the array.
     * (the question wasn't clear, I figured it out by looking at the example test input and result.)
     */
    public static void main(String[] args) {
        int num = solveAndGetLastTwoDigits(getNumbers(10));
        System.out.println(num);
    }

    public static int[] getNumbers(int n){
        System.out.println("Enter "+n+ " numbers: ");
        int[] arr = new int[n];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static int solveAndGetLastTwoDigits(int[] arr){
        int res = 1;
        for (int value : arr) {
            res *= value;
        }
        return res % 100;
    }
}
