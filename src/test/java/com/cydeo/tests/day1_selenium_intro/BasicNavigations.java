package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations  {
    public static void main(String[] args) throws InterruptedException {


        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- cretae instance of the selenium web driver
        WebDriver driver = new ChromeDriver();

        // this line maximize the browser size
        driver.manage().window().maximize();

        //3- go to tesla.com
        driver.get("https://www.tesla.com");

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        driver.navigate().forward();

        // stop code execution for 2 seconds
        Thread.sleep(2000);

        //use selnium to navigate refresh
        driver.navigate().refresh();

        // stop code execution for 2 seconds
        Thread.sleep(2000);

        // use navigate().to();
        driver.navigate().to("https://www.google.com");

        //get the title of the page
       // System.out.println("driver.getTitle() " + driver.getTitle());
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

// this will close the currently opened window
        driver.close();

        //this will close all of the opened windows
        driver.quit();



    }
}
