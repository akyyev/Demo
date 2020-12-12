package com.demo.Interview_Questions;

import java.util.ArrayList;

public class Prime_number {
    public static void main(String[] args) {

        System.out.println("primesTill(100) = " + primesTill(100));
        System.out.println("isPrime(100) = " + isPrime(100));
        System.out.println("getIndexOfPrimeNumber(97) = " + getIndexOfPrimeNumber(97));
        System.out.println("isPrimeSqrt(179426549) = " + isPrimeSqrt(179426549));
        System.out.println("Check isPrime of the number (more than 1000 billion): " + isPrimeSqrt(100_000_044_841L));

        System.out.println(codeHere("1 10000000"));
        System.out.println(System.getenv("SAHER"));
    }

    /**
     * @param primeNumber
     * @return  if input is invalid returns -1, otherwise index of given prime
     */
    private static int getIndexOfPrimeNumber(int primeNumber){
        return primesTill(primeNumber).indexOf(primeNumber);
    }


    private static ArrayList<Integer> primesTill(int num){
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(2);

        for(int i=3; i<=num; i++){
            if(isPrime(ls, i)) ls.add(i);
        }
        return ls;
    }

    //significantly faster than my solution
    private static boolean isPrimeSqrt(long a){
        int i = 2;
        double root = Math.sqrt(a);
        while (i <= root){
            if (a % i == 0) return false;
            ++i;
        }
        return true;
    }

    //significantly faster than my solution
    private static boolean isPrimeSqrtAnotherWay(long a){
        int i = 2;
        while (i*i <= a){
            if (a % i == 0) return false;
            ++i;
        }
        return true;
    }

    /**
     * Returns largest prime within given input string separated with space.
     * @param inp two numbers separated with space
     * @return largest prime within 2 numbers, if no prime returns -1 as string
     */
    public static String codeHere(String inp){
        String[] arr = inp.split(" ");
        long first = Long.parseLong(arr[0]);
        long second = Long.parseLong(arr[1]);

        for(long i=second; i>=first; i--){
            if(isPrimeSqrt(i)) return i+"";
        }
        return "-1";
    }


    private static boolean isPrime(int number){
        ArrayList<Integer> ls = primesTill(number);
        return ls.contains(number);
    }

    private static boolean isPrime(ArrayList<Integer> ls, int number){
        for(Integer each: ls){
            if(number % each == 0 ) return false;
        }
        return true;
    }

}
