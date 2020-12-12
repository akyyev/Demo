package com.demo.Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vonage_Num_Siblings {


    public static void main(String[] args) {
        int res = getLargestSibling(24130);
    }

    private static int getLargestSibling(int num){
        List<Integer> ls = new ArrayList<>();

        while(num!=0){
            ls.add(num%10);
            num /=10;
        }

//        ls.sort(Comparator.reverseOrder());
        ls.sort((x,y)-> x>y? 1: x<y? -1:0);
        int res =  0;
        int base = 1;


        for(int number: ls){
            res += number * base;
            base *= 10;
        }

        System.out.println(res);
        return res;
    }
}
