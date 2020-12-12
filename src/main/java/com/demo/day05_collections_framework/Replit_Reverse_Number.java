package com.demo.day05_collections_framework;

import java.util.*;

public class Replit_Reverse_Number {

    public static void main(String[] args) {


        System.out.println(reverseInt(901312012));
        System.out.println(reverseInt(-204));
    }

    /**
     * Not good solution
     */
    private static int reverseInt(int number){
        ArrayList<Integer> list = new ArrayList<>();
        int res = 0;
        while(number != 0){
            list.add(number%10);
            number = number/10;
        }

        int m=0;
        for(int i=list.size()-1; i>=0; i--){
            res+=list.get(m)*Math.pow(10,i);
            m++;
        }
        return res;
    }

    private static int reverseInt2(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    /**
     * Not bad solution
     */
    private static int reverseInt3(int number) {
        String str = number+"";
        String res = "";
        for(int i=str.length()-1; i>=0; i--){
            res += str.charAt(i);
        }
        return Integer.parseInt(res);
    }



}