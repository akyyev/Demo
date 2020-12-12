package com.demo.Interview_Questions;

import java.util.*;

public class Factorial {


    public static void main(String[] args) {
        System.out.println(getFactorial(3));
        System.out.println(getFactorial2(3));

        System.out.println(getFactorial(10));
        System.out.println(getFactorial2(10));


        Map<String, Integer> dic = new HashMap<>();
        System.out.println(dic.get("A"));

    }

    private static int getFactorial(int number) {
        if(number==1) return 1;
        else return number * getFactorial(number-1);
    }

    private static int getFactorial2(int number){
        int prod = 1;
        for(int i=1; i<=number; i++){
            prod *= i;
        }
        return prod;
    }
}