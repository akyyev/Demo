package com.demo.day05_collections_framework;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Arrays_Stream_Lambda_Expressions {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,2,2,3,4,5,6,7,8,9,10,10};

        double avg = Arrays.stream(arr).sum()/(double) arr.length;

        IntStream ints = Arrays.stream(arr);

        //ints.filter(x->x%2==0).forEach(System.out::print);
        ints.distinct().forEach(System.out::print);
        int sum = Arrays.stream(arr).reduce((x,y)->(x+y)).getAsInt();

        System.out.println("\nSum is: "+sum);
    }
}
