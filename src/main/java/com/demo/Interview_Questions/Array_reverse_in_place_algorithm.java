package com.demo.Interview_Questions;

public class Array_reverse_in_place_algorithm {
    public static int helper(int x, int y) {return x;}

    /* Function to reverse arr[]
       from start to end*/
    public static void reverseArray(int []arr, int n) {
        for (int i = 0; i < n / 2; i++)
            arr[i] = helper(arr[n - i - 1], arr[n - i - 1] = arr[i]);
    }

    /* Utility function to print an array */
    public static void printArray(int []arr) {
        for (int each : arr) System.out.print(each + " ");
        System.out.println("");
    }

    // Driver code
    public static void main(String[] args) {
        int []arr = new int[]{1, 2, 3, 4, 5, 6};
        int n = arr.length;
        printArray(arr);
        reverseArray(arr, n);
        System.out.println("Reversed array is");
        printArray(arr);


        reverse(arr);
        printArray(arr);

    }

    private static void reverse(int[] arr) {
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }


}
