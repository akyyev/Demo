package com.demo.Interview_Questions;

public class Array_Get_Max_Contiguous_Sum {

    public static void main(String[] args) {
        int[] arr = {-10,2,3,-2,0,5,-15};
        System.out.println(partialContSum(arr));//8
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

}

