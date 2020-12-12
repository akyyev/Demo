package com.demo.Interview_Questions;

public class Binary_Linear_Search {

    public static void main(String[] args) {

        //Try changing the size and the target numbers to see the impact.
        int ARRAY_SIZE = 200_000_000;
        int TARGET = 290_999_996;

        // Generate a sorted array
        int[] numbers = new int[ARRAY_SIZE];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        long a = System.currentTimeMillis();
        System.out.println("Searching for " + TARGET + ": ");
        System.out.println("Found at: " + binarySearch(numbers,TARGET));
        System.out.println("How long with Binary: "+ (System.currentTimeMillis()-a)+ " millis\n");


        a = System.currentTimeMillis();
        System.out.println("Searching for " + TARGET + ": ");
        System.out.println("Found at: " + linearSearch(numbers,TARGET));
        System.out.println("How long with Linear: "+ (System.currentTimeMillis()-a)+ " millis");


    }


    /**
     * @param key Value to search for
     * @param numbers array of numbers to search through
     * @return index position for key
     */

    private static int binarySearch(int[] numbers, int key) {
        int low=0;
        int high = numbers.length-1;
        int counter = 0;

        while (low<=high) {
            counter ++;
            //Find mid-point
            int mid = (low + high)/2;

            //Test mid-point
            int current = numbers[mid];

            if (current==key) {
                System.out.println("Binary Search Steps: " + counter);
                return mid;
            }
            //Based on results, adjust low and high
            else if (current<key) {
                low = mid + 1;
            }
            else {//Too High
                high = mid -1;
            }
        }
        return -1;
    }

    /**
     * @param key Value to search for
     * @param numbers array of numbers to search through
     * @return index position for key
     */
    private static int linearSearch(int[] numbers, int key) {
        int counter = 0;
        for (int i=0;i<numbers.length;i++) {
            counter ++;
            if (numbers[i]==key) {
                System.out.println("Linear Search Steps: " + counter);
                return i;
            }
        }
        return -1;
    }
}
