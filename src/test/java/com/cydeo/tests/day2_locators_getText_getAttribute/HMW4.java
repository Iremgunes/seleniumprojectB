package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
       driver.get("https://practice.cydeo.com/inputs");
        //3- Click to “Home” link

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        if(driver.getTitle().equals("Practice")){
            System.out.println("verification passed");
        }

        driver.close();

        //4- Verify title is as expected:
        //Expected: Practice
        //PS: Locate “Home” link using “className” locator


    }
}
