package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void window_handling_test(){

        driver.get("https://www.amazon.com");

        ((JavascriptExecutor)driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://facebook.com','_blank');");

        /*
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);

            System.out.println("current url :" + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains("etsy")){
                break;
            }


        }

        String actualTitle = driver.getTitle();
        String expectedinTitle = "Etsy";

        Assert.assertTrue(actualTitle.contains(expectedinTitle));


         */

        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");



         }




}
