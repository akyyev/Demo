package com.demo.Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArraysWithoutBreakingOrder{

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,10};
        int[] arr2 = {2,4,6,8,9,12};

        System.out.println(Arrays.toString(merge(arr1, arr2)));

    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int l = arr1.length+ arr2.length;
        int[] res = new int[l];
        int i=0, j=0, c=0;

        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]) res[c++] = arr1[i++];
            else res[c++] = arr2[j++];
        }

        while (i<arr1.length){
            res[c++] = arr1[i++];
        }

        while (j<arr2.length){
            res[c++] = arr2[j++];
        }
        return res;
    }


}

class Main {
    public static void main(String[] args){

        String[] arr3 = {"1","g","aabb","7","7","2","aa","7"};
        String[] arr4 = {"1","a","a", "a", "2", "2"};

        System.out.println(getDup(arr3));
        System.out.println(getDup(arr4));

    }

    private static int getDup(String[] arr){
        int sum = 0;
        List<String> processed = new ArrayList<>();

        for(String each: arr){
            if(processed.contains(each) || freq(arr, each)<2) continue;
            processed.add(each);
            sum += freq(arr, each);
        }
        return sum;
    }

    private static int freq(String[] arr, String element){
        int c = 0;
        for(String each: arr){
            if(each.equals(element)) c++;
        }
        return c;
    }
}