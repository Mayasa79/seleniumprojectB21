package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println(" title verification is PASSED!");
        } else {
            System.out.println("FAILED!!");
        }
        driver.close();

    }
}
/*
 TC #1: FacebookTitle Verification1.Open Chrome browser
     2.Go
 to https://www.facebook.com.Verify title: Expected: Facebook
 -Log In or Sign Up
 */