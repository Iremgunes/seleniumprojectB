package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Linktext_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        Thread.sleep(2000);

        // click to A/B testing from top of the list
        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        Thread.sleep(2000);

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("title verification passed");
        }else {
            System.out.println("title verification failed");
        }

        driver.navigate().back();
        String expectedTitleNew = "Practice";
        String actualTitleNew = driver.getTitle();

        if(actualTitleNew.equals(expectedTitleNew)){
            System.out.println("title 2 verification passed ");
        }else {
            System.out.println("title 2 verification failed");
        }


        Thread.sleep(5000);

        driver.close();




    }
}
