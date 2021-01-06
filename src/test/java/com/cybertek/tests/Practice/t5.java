package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t5 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String expectedTitle="Web Orders Login";
        String actualTitle=driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("pass!!!");
        }else {
            System.out.println("FAILED!!!");
        }
        System.out.println(expectedTitle);
        System.out.println(actualTitle);
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        String expectedLogInTitle="Web Orders";
        String actualLogInTitle=driver.getTitle();
        if (actualLogInTitle.equals(expectedLogInTitle)){
            System.out.println("PASSED!!");
        }else{
            System.out.println(" FAILED!!!");
        }

    }
}
