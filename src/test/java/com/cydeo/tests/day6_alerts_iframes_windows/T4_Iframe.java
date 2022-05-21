package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe {
   // 2. Create new test and make set ups
//3. Go to: https://practice.cydeo.com/iframe
   //4. Assert: “Your content goes here.” Text is displayed.
//5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void iframe_test(){
       driver.get("https://practice.cydeo.com/iframe");
       //locate the paragraph p tag
        driver.switchTo().frame("mce_0_ifr");
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());





    }



}
