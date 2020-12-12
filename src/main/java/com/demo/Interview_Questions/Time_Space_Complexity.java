package com.demo.Interview_Questions;

public class Time_Space_Complexity {

    public static void main(String[] args) {
        System.out.println(solve(5));
    }

    public static String solve(int n){
        StringBuilder stb = new StringBuilder("");

        while(n>=1){
            if(n%2==1){
                stb.append(2);
                n = (n-1)/2;
            } else {
                stb.append(8);
                n = (n-2)/2;
            }
        }
        return stb.toString();
    }


}
