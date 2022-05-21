package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdown {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropDownTest(){

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropdownText = currentlySelectedOption.getText();

        String expectedSimpleDropDownText = "Please select an option";

        System.out.println("actualSimpleDropdownText = " + actualSimpleDropdownText);

        Assert.assertEquals(actualSimpleDropdownText, expectedSimpleDropDownText);

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedStateDropDownText = "Select a State";

        String actualStateDropDownText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDropDownText, expectedStateDropDownText);



    }



}
