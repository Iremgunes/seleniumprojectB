package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

      //        Open Chrome browser
        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com ");

        //3. Search for “wooden spoon”
       WebElement searchFor = driver.findElement(By.id("global-enhancements-search-query"));
       searchFor.sendKeys("wooden spoon" + Keys.ENTER);

       String expectedTitle = "Wooden spoon | Etsy";

      //  4. Verify title:
       // Expected: “Wooden spoon | Etsy”

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("title verification passed");
        }else{
            System.out.println("title verification failed");
        }

        driver.close();



    }
}
