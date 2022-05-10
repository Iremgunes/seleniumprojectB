package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");
        //3- Click to Gmail from top right.
        WebElement gmailButton = driver.findElement(By.linkText("Gmail"));
       gmailButton.click();
        // 4- Verify title contains:
        //Expected: Gmail

        String expectedTitle = "Gmail";

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.contains(expectedTitle)){
            System.out.println("passed");
        }

        Thread.sleep(2000);
        //5- Go back to Google by using the .back();
      driver.navigate().back();
       // 6- Verify title equals:
       // Expected: Google

        String expectedTitle2 = "Google";
        String actualNew = driver.getTitle();

        if(actualNew.equals(expectedTitle2)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        Thread.sleep(2000);

        driver.close();


    }
}
