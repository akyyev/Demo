package com.demo.Interview_Questions;

public class Array_Get_Max_Contiguous_Sum {

    public static void main(String[] args) {
        int[] arr = {-10,2,3,-2,0,5,-15};
        System.out.println(partialContSumBetter(arr));//8
    }

    public static int partialContSum(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum>max) max=sum;
            }
        }
        return max;
    }

    public static int partialContSumBetter(int[] arr){
        // -10,2,3,-2,0,5,-15
        //  Add adjacent pairs get bigger one (b1)
        //  compare b1 with sumSoFar, 
        if(arr.length == 1) return arr[0];
        if(arr.length == 0) return 0;

        int sumSoFar = 0;
        int partialSumTillI = 0;

        for (int i = 1; i < arr.length; i++) {
            partialSumTillI = Math.max(partialSumTillI + arr[i], arr[i]);
            sumSoFar = Math.max(partialSumTillI, sumSoFar);
        }
        return sumSoFar;
    }
}

