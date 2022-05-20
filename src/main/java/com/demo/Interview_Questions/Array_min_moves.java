package com.demo.Interview_Questions;

public class Array_min_moves {


    public static void main(String[] args) {
        // How to make two Arrays the same by adding or removing numbers in the shortest way
        int numberOfMoves = minMoves(
                // Here no need to change anything for first numbers,
                // 1 -> 3 (2)
                // 0 -> 4 (4)
                // 0 -> 5 (5)
                // Result = 2+4+5 = 11

                    new int[]{123, 100},
                    new int[]{123, 345}
                );
        System.out.println(numberOfMoves);
    }

    private static int minMoves(int[] arr1, int[] arr2){
        int count = 0;

        if(arr1.length != arr2.length)
            throw new RuntimeException("Different length of arrays has been passed!");

        for(int i=0; i<arr1.length; i++){
            do {
                int lastDigit1 = arr1[i] % 10,
                    lastDigit2 = arr2[i] % 10;

                arr1[i] = arr1[i] / 10;
                arr2[i] = arr2[i] / 10;

                count += Math.abs(lastDigit1 - lastDigit2);
            } while (arr1[i] != 0 || arr2[i] != 0);
        }

        return count;
    }
}
