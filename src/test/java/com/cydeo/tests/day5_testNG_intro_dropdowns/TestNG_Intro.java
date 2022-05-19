package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("----> before class is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("---> after class is running !!");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("-----> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("------> afterMethod is running! ");
    }

    @Test (priority = 1) // herhangi bir öncelik yoksa ya da aynı öncelikte ise alfabetik sıra
    public void test1(){
        System.out.println("Test 1 is running...");
    }


  @Test (priority = 1)
  public void test2(){
      System.out.println("test 2 is running...");
  }






}
