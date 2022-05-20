package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void selenium_test(){
        //do browser driver set up
        //open browser
        //WebDriver driver = WebDriverFactory.getDriver("chrome");

        //maximaze the page
       // driver.manage().window().maximize();

       //implicit wait
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //get "https://google.com
        //assert title is google
        driver.get("https://google.com");

        String expectedTitle= "Google";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Ttitle is not matching here");
    }




}
