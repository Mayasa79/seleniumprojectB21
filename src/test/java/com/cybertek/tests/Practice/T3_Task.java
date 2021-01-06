package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_Task {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        String expectedTitle="Zero Bank";
        String actualTitle=driver.getTitle();
        if (expectedTitle.contains(actualTitle)){
            System.out.println("PASSED!!");

        }else{
            System.out.println("Failed!!!");
        }

    }
}
