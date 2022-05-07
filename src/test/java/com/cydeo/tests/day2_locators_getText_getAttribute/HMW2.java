package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

      //  3. Verify header text

       // Expected: “Log in to ZeroBank”
        String expectedHeadreText = "Log in to ZeroBank";

        WebElement headerText = driver.findElement(By.tagName("h3"));

        String actualHeadreText = headerText.getText();

        if(actualHeadreText.equals(expectedHeadreText)){
            System.out.println("verfication passed");
        }else{
            System.out.println("verification failed");
        }

        driver.close();

    }



}
