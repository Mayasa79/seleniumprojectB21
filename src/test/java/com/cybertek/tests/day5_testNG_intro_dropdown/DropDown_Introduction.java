package com.cybertek.tests.day5_testNG_intro_dropdown;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDown_Introduction {
    WebDriver driver;

    @BeforeClass
    public void setupClass(){

        //TC#1: Verifying "Simple dropdown" and "State selection" dropdown default values
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdown_test1(){


        //3. Verify "Simple dropdown" default selected value is correct
        //Expected: "Please select an option"


        //4. Verify "State selection" default selected value is correct
        //Expected: "Select a State"
    }

}