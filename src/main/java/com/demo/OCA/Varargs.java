package com.demo.OCA;

public class Varargs {

    public static void method(int start, int... nums){
        System.out.println("----------"+start+"------------");
        System.out.println(nums.length);
    }

    public static void main(String[] args) {
        method(5);
        method(100,1,2);
        method(500, 0,1,2,3,4,5,6,7,8,9);
        method(300, new int[]{1,1,1,1});
    }
}
