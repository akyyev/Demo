package com.demo.Interview_Questions;

import java.util.ArrayList;
import java.util.List;

public class GenerateRandNumbers {
    /**
     * Write a function to generate all the integer values from 1...n exactly once, where n is input.
     * Using random function random() that returns floating point value between 0 and 1(inclusive).
     * void generateRandomNumbers(Integer n) —> prints list of integers from 1...n in random order
     */

    public static void main(String[] args) {
        generateRandomNumbers(10);
    }

    private static List<Integer> generateRandomNumbers(Integer n){
        List<Integer> ls = new ArrayList<>();
        while(ls.size()<n){
            int rand = (int) (Math.random() * n);
            if( !ls.contains(rand)) ls.add(rand);
        }
        int c=1;
        for (int e: ls){
            System.out.println(c+": "+e);
            c++;
        }
        return ls;
    }

}
