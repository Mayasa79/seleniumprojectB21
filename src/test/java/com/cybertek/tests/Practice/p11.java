package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11 {
    public static void main(String[] args) throws InterruptedException {
       //1. setUp web driver
        WebDriverManager.chromedriver().setup();
       // 2 create instant of webDriver
        WebDriver driver=new ChromeDriver();
        // 3 and use it to get the URL  we want
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println( " Current title of the page"+driver.getTitle());
String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = "+currentUrl);
        // we are using navigate from the Selenium library

      Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.get("https://www.tesla.com");
        System.out.println( "Current title of the page"+driver.getTitle());
        System.out.println("currentUrl = "+currentUrl);
        driver.quit();



    }
}
