package com.demo.Interview_Questions;

public class ArraysLargestNumberFrequency {
    public static void main(String[] args) {
        int[] arr = new int[] {11, 10, 5, 11, 12, 6, 10, 9, 10, 6, 12};
        int freq = getLargestNumberFrequency(arr);
        System.out.println(freq);
    }

    public static int getLargestNumberFrequency(int[] arr) {
        int count = 0;
        int largest = arr[0];

        for(int number: arr) {
            if(number > largest) {
                largest = number;
                count = 1;
            } else if(number == largest) {
                count++;
            }
        }
        return count;
    }
}
