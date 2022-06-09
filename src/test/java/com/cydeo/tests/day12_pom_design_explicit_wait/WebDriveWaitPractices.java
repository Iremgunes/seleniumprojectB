package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriveWaitPractices {

    @Test
    public void dynamic_load_7_test(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());




    }

    @Test
    public void dynamic_load_1_test(){
//. Go to https://practice.cydeo.com/dynamic_loading/1

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

       // 2. Click to start
      //  3. Wait until loading bar disappears

        dynamicLoad1Page.startButton.click();

        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());

      //  5. Enter username: tomsmith
        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");

       // 6. Enter password: incorrectpassword
        dynamicLoad1Page.inputPassword.sendKeys("somethinwrong");

       // 7. Click to Submit button
        dynamicLoad1Page.submitButton.click();

       // 8. Assert “Your password is invalid!” text is displayed.

        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());




    }


}
