package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_locators_cssSelector {
    public static void main(String[] args) {


        //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //  2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password

        String expectedText = "Reset password";

       WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

       String actualTextPasswordButton = resetPasswordButton.getText();

        System.out.println("actualTextPasswordButton = " + actualTextPasswordButton);

       if(actualTextPasswordButton.equals(expectedText)){
           System.out.println("verification passed");
       }else{
           System.out.println("verification failed");
       }

       driver.close();




    }
}
