package com.demo.unit_test.primes;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    /**
     * @param primeNumber
     * @return  if input is invalid returns -1, otherwise index of given prime
     */
    private static int getIndexOfPrimeNumber(int primeNumber){
        return primesTill(primeNumber).indexOf(primeNumber);
    }

    static long get_big_prime(int digit){
        if (digit<1) return -1;
        long end = (long) Math.pow(10,digit);
        while (true){
            if(isPrime(end)) return end;
            else end -=1;
        }
    }

    static ArrayList<Integer> primesTill(int num){
        ArrayList<Integer> ls = new ArrayList<>();

        for(int i=2; i<=num; i++){
            if(isPrime(i)) ls.add(i);
        }
        return ls;
    }

    //significantly faster than my solution
    static boolean isPrime(long a){
        int i = 2;
        double root = Math.sqrt(a);
        while (i <= root){
            if (a % i == 0) return false;
            ++i;
        }
        return true;
    }


    static void sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++) {
            // If prime[p] is not changed, then it is a prime
            if(prime[p]) {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= n; i++) {
            if(prime[i])
                System.out.print(i + " ");
        }
    }
}
