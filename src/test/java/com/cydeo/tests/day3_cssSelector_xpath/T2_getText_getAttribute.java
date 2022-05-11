package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("label verification passed");
        }else {
            System.out.println("failed");
        }

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText = "Forgot your password?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();

        System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);

        if(actualForgotPasswordLinkText.equalsIgnoreCase(expectedForgotPasswordLinkText)){
            System.out.println("forgot password link verification passed");
        }else {
            System.out.println("failed");
        }

        String expectedHref = "forgot_password=yes";

        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if(actualHrefAttributeValue.contains(expectedHref)){
            System.out.println("href attribute value varification passed");
        }else{
            System.out.println("failed");
        }

        














    }
}
