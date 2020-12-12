package com.demo.day06_testng.testNG_Annotations;

import org.testng.annotations.Test;

public class ClassA extends Base {



    @Test
    public void test1(){
        System.out.println("Class-A Test-1");
    }

    @Test
    public void test2(){
        System.out.println("Class-A Test-2");
    }

}
