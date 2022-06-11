package com.cydeo.reviewWithOscar.week06;

import com.cydeo.reviewWithOscar.week06.pomForReview.WaitTaskPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.ReviewUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitExamples {

    WebDriverWait wait;
    WaitTaskPage page;



    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
         wait = new WebDriverWait(Driver.getDriver(), 10);
        page = new WaitTaskPage();

    }

      //1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
        //2. Click on "Click me, to Open an alert after 5 seconds"




       //3. Explicitly wait until alert is present
    //4. Then handle the Javascript alert

    @Test
    public void test_1(){

        page.alertActivate.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


    }

    @Test
    public void test_2(){
        page.enable.click();
        wait.until(ExpectedConditions.elementToBeClickable(page.disable));
        Assert.assertTrue(page.disable.isEnabled(), "Button has NOT been enabled YET!");


    }

    @AfterMethod
    public void tearDown(){
        ReviewUtils.staticWait(2);
        Driver.closeDriver();
    }


}
