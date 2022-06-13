package com.cydeo.tests.day13_review_interview;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.cydeo.utilities.Driver.getDriver;

public class ExplicitWaitPractices {

    DynamicControlsPage page;

    @BeforeMethod
    public void setupMethod(){
        getDriver().get("https://practice.cydeo.com/dynamic_controls");

        page = new DynamicControlsPage();
    }

    // 1- Open a chrome browser
   //2- Go to: https://practice.cydeo.com/dynamic_controls
     //       3- Click to “Remove” button
//4- Wait until “loading bar disappears”
  //          5- Verify:
   // a. Checkbox is not displayed
    //b. “It’s gone!” message is displayed.

    @Test
    public void remove_button_test(){

        page.removeButton.click();

       // Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //wait.until(ExpectedConditions.invisibilityOf(page.loadingBar));
        BrowserUtils.waitForInvisibilityOf(page.loadingBar);


        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Assert.assertTrue(!page.checkbox.isDisplayed());
            Assert.assertFalse(page.checkbox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }

        Assert.assertTrue(page.message.isDisplayed());
        Assert.assertTrue(page.message.getText().equals("It's gone!"));


    }

    @Test
    public void enable_button_test(){
       // Click to “Enable” button
       // 4- Wait until “loading bar disappears”
       // 5- Verify:
       // a. Input box is enabled.
       // b. “It’s enabled!” message is displayed.

        page.enableButton.click();

        System.out.println("page.inputBox.isEnabled() = " + page.inputBox.isEnabled());

        //System.out.println("page.enableButton.isEnabled() = " + page.enableButton.isEnabled());

        BrowserUtils.waitForInvisibilityOf(page.loadingBar);

        System.out.println("page.inputBox.isEnabled() = " + page.inputBox.isEnabled());

        Assert.assertTrue(page.inputBox.isEnabled());

        Assert.assertTrue(page.message.isDisplayed());

        Assert.assertTrue(page.message.getText().equals("It's enabled!"));



    }




}
