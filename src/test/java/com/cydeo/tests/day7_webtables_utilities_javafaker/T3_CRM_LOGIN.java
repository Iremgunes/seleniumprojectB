package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

      driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void crm_login_test(){

        driver.get("https://login1.nextbasecrm.com");

        WebElement loginBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginBox.sendKeys("helpdesk1@cybertekschool.com");

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys("UserUser");

        WebElement logınButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logınButton.click();

        BrowserUtils.verifyTitle(driver, "Portal");


    }


}
