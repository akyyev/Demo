package com.demo.day6_testng;

import com.demo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Basic_Navigation_With_testNG {

    WebDriver driver = Driver.get();

    @BeforeMethod
    public void setup(){
        System.out.println("Test is starting");
        driver.get("https://google.com");
    }


    @AfterMethod
    public void teardown(){
        System.out.println("Test completed!");
        Driver.quit();
    }


    @Test(description = "Switching to the next tab")
    public void test1(){
        driver.get("http://webdriveruniversity.com/index.html");
        driver.findElement(By.cssSelector("#button-clicks>div>div>h1")).click();
        List<String> ls = new ArrayList<>(driver.getWindowHandles());

        Driver.sleep(3);
        driver.switchTo().window(ls.get(1));
        System.out.println(driver.getTitle());
    }





}
