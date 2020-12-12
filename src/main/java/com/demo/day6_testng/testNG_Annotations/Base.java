package com.demo.day6_testng.testNG_Annotations;

import org.testng.annotations.*;

public class Base {

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is beforeTest must run only once before execution of 1st test has started");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This is afterTest must run only once after all tests have completed");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite: Runs before the suite (can be multiple classes in .xml file or just a class)");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite: Runs after the suite (can be multiple classes in .xml file or just a class)");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Hi this is before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Hi this is after class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }


}
