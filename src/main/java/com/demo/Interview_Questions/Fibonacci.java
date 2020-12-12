package com.demo.Interview_Questions;

public class Fibonacci {


    public static void main(String[] args) {
        print("Hello");
        print(123);
        print(false);
        print('c');
        print(12.4);
        print(new Fibonacci() instanceof Object);
        // f  f  f  s
        // 1  2  3  4  5  6  7   8   9
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
        print(fibonacci(9));
        print(fibonacci_recursive(0));

        System.out.println(fibonacciChecker("5"));
    }

    private static String fibonacciChecker(String number){
        int num = Integer.parseInt(number);

        int f=0, s=1;
        int res = 0;
        while(res < num){
            res = f+s;
            f = s;
            s = res;

        }

        if(res == num) return "yes";
        return "no";
    }

    private static int fibonacci(int num){
        int f = 0;
        int s = 1;
        int res = f+s;
        if(num==0) return 0;
        for(int i=1; i<=num-2; i++){
            res = f+s;
            f = s;
            s = res;
        }
        return res;
    }


    private static int fibonacci_recursive(int num){
        if (num<=1) return 0;
        else if(num==2) return 1;
        else return fibonacci_recursive(num-1)+fibonacci_recursive(num-2);
    }


    private static void print(Object obj){
        System.out.println(obj);
    }


}