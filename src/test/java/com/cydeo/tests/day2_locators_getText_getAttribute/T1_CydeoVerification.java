package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");

        String expectedURL = "cydeo";

        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        if(actualURL.equals(expectedURL)){
            System.out.println("url verification passed");
        }else{
            System.out.println("url verification failed");
        }

        String expectedTitle = "Practice";

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("title verification passed");
        }else{
            System.out.println("title verification failed");
        }








    }
}
