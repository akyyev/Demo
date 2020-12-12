package com.demo.Interview_Questions;

class Array_Get_Cont_Max_Frequency{


    public static void main(String[] args) {

        int[] ar = {1,1, 0, 2, 2, 2, 2};
        System.out.println(getContMaxFreq(ar));//4

    }

    private static int getContMaxFreq(int[] arr){
        int count = 0;
        int max = 0;
        int temp = arr[0];
        for (int value : arr) {

            if (temp == value) {
                count++;
                if (count > max) max = count;
            } else {
                temp = value;
                count = 1;
            }

        }
        return max;
    }
}
