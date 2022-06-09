package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setUpMethod(){

        Driver.getDriver().get("https://library1.cydeo.com/");
        libraryLoginPage = new LibraryLoginPage();

    }

    @Test
    public void required_field_error_message_test(){

        libraryLoginPage.sigInButton.click();

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_test(){

        libraryLoginPage.inputUsername.sendKeys("akldmskcmlkdmck");

       libraryLoginPage.sigInButton.click();

       Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

       Driver.closeDriver();


    }

    @Test
    public void library_negattive_login_test(){

        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");

        libraryLoginPage.sigInButton.click();

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

        Driver.closeDriver();

    }

}
