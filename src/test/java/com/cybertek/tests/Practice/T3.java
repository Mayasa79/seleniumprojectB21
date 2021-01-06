package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        // to be able to click we need to locate the
        driver.findElement(By.linkText("Gmail")).click();
        String expectedInTitle="Gmail";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedInTitle)){
            System.out.println(" title ver is Passed!!");
        }else{
            System.out.println(" title is faild");
        }
        driver.navigate().back();
        String expectedGoogleTitle="Google";
        String actualGoogleTitle=driver.getTitle();
        if (actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println(" google title is passed");
        }else{
            System.out.println("Faild!!!");
        }
        driver.close();;
    }
}
