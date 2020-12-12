package com.demo.day10_stringBuilder_formatting_genericClasses;

public class StringFormatting {

    public static void main(String[] args) {

        System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);

        // Aligning to the left with -2d
        for(int i=0; i<=10; i++){
            System.out.printf("%-2d: %s: %d\n", i, "-> square is", i*i);
        }

        // Formatting floating point numbers, rounding numbers
        System.out.printf("Total value: %.2f\n", 2.6595);
        System.out.printf("Total value: %10.1f", 152.6595); // 10 characters total
    }
}
