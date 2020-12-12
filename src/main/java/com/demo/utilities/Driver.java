package com.demo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver get(String browser){
        if(driver == null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "edge":
                    if (System.getProperty("os").contains("Windows")) {
                        WebDriverManager.edgedriver().setup();
                        driver = new EdgeDriver();
                    } else {
                        throw new RuntimeException("Not allowed to run edge browser");
                    }
                    break;
            }
        }
        return driver;
    }

    //overloading method
    public static WebDriver get(){
        return get("chrome");
    }

    public static void quit(){
        driver.quit();
    }


    public static void sleep(int sec){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        RemoteWebDriver driver;

        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
    }



}
