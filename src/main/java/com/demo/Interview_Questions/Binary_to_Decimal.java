package com.demo.Interview_Questions;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        //Simplest Method
        String binaryNumber = "100101"; // 1*2^0 + 0*2^1+ 1*2^2
        System.out.println(Integer.parseInt(binaryNumber, 2));

        //Second Method
        int num = 100101;
        System.out.println(binaryToDecimal(num));
    }


    private static int binaryToDecimal(int n) {
        int sum = 0;
        int base = 1;

        while(n>0){
            //By getting module we get last digit then we multiply with base
            sum += n%10 * base;
            //Here we get rid of last digit
            n /= 10;
            base *= 2;
        }

        return sum;
    }
}
