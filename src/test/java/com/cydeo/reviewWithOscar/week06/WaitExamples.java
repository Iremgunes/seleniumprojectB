package com.cydeo.reviewWithOscar.week06;

import com.cydeo.reviewWithOscar.week06.pomForReview.WaitTaskPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.ReviewUtils;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitExamples {

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    }

      //1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
        //2. Click on "Click me, to Open an alert after 5 seconds"




       //3. Explicitly wait until alert is present
    //4. Then handle the Javascript alert

    @Test
    public void example_tasks(){
        WaitTaskPage page = new WaitTaskPage();
        page.alertActivate.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);



    }

    @AfterMethod
    public void tearDown(){
        ReviewUtils.staticWait(2);
        Driver.closeDriver();
    }


}
