package com.demo.day6_testng;

import com.demo.utilities.BrowserUtils;
import com.demo.utilities.Driver;
import org.openqa.selenium.WebDriver;

public class NavigateTo_get {

    public static void main(String[] args) {

        WebDriver driver = Driver.get();
        driver.get("https://google.com");
        BrowserUtils.wait(2);
        driver.get("https://amazon.com");
        driver.navigate().back();

        driver.quit();
        System.out.println(driver.getTitle());

    }
}
