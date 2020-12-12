package com.demo.unit_test.primes;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.List;

public class Unit_tests {

    @Test(testName = "Check 17 is prime or not")
    public void test1(){
        Assert.assertTrue(Prime.isPrime(17));
    }


    @Test(testName = "Verify prime list is correct")
    public void test2(){
        List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        Assert.assertEquals(expected, Prime.primesTill(100));
    }


    @Test(testName = "Verify index of 97 is equal to 24")
    public void test3(){
        Assert.assertEquals(Prime.primesTill(100).get(24).intValue(), 97);
    }


    @Test(testName = "Verify largest 15 digit prime is equal to 999999999999989")
    public void test4(){
        long l = Prime.get_big_prime(15);
        Assert.assertEquals(BigInteger.valueOf(l).toString(), "999999999999989");
    }
}
