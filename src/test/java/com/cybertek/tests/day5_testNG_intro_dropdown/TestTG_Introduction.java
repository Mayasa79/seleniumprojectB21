package com.cybertek.tests.day5_testNG_intro_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestTG_Introduction {


    @BeforeMethod
    public void setupMethod() {
        System.out.println("--->Before method is running...");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("--->After method is running...");
    }


    /*
      @BeforeClass will make the method run once before everything else in the class.
       */
    @BeforeClass
    public void setupClass() {
        System.out.println("------>Before class is running...");
    }

    /*
     @AfterClass will make the method run once after everything else in the class.
      */
    @AfterClass
    public void teardownClass() {
        System.out.println("------>After class is running...");
    }

    @Test
    public void test1() {
        System.out.println("->Running test 1...");
    }

    @Test
    public void test2() {
        System.out.println("->Running test 2...");
    }

    @Test
    public void test3(){
        System.out.println("->Running test 3...");

        String str1 = "hello";
        String str2 = "hello2asdfasdf";

        //assertTrue: expects a boolean value to be passed
        Assert.assertTrue(str1.equals(str2) , "Comparing hello word's failed.");

        //assertEquals: expects two arguments of the same type: String VS String etc.
        Assert.assertEquals(str1, str2 , "Asserting with assertEquals on line 56");

        //the last string argument will be accepted as "failure message"

    }



}