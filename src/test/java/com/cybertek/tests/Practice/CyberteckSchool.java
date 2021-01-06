package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CyberteckSchool {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        String expecteTitle ="cybertekschool";
        String actuaTitle=driver.getCurrentUrl();
        if (actuaTitle.contains(expecteTitle)){
            System.out.println("PASSES");
        }else{
            System.out.println("Faild");
        }

    }
}
