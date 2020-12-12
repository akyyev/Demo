package com.demo.Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task_13_remove_nums_greater_than_100 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 94, 100, 900, 4, 1000));

        //first way
        nums.removeIf(number->number>=100);

        //second way
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()){
            if(it.next()>=50) it.remove();
        }

        System.out.println(nums);
    }

}
