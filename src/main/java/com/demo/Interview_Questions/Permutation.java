package com.demo.Interview_Questions;

public class Permutation {

    public static void main(String[] args) {
        printPermutation("abcd");
    }


    public static void printPermutation(String str) {
        calculate(str, 0, str.length() - 1);
    }


    private static void calculate(String str, int left, int right) {
        // This is a base case if left pointer reaches right pointer then we need to print the string
        if (left == right) System.out.println(str);
        else {
            for (int i = left; i <= right; i++) {
                String swapped = swap(str, left, i); // swapping character that is itself
                calculate(swapped, left + 1, right); // calling recursive method to swap the rest of the string
            }
        }
    }

    public static String swap(String str, int a, int b) {
        char[] arr = str.toCharArray();
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return String.valueOf(arr);
    }


}
