package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_locators_getText_getAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //Enter incorrect username into login box:

      WebElement loginBox = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
      loginBox.sendKeys("incorrectname" + Keys.ENTER);

             //4- Click to `Reset password` button

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        resetPasswordButton.click();

        //5- Verify “error” label is as expected






    }
}
