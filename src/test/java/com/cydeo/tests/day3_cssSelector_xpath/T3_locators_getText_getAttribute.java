package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_locators_getText_getAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        String expectedText = "Log In";

        //WebElement logınButton = driver.findElement(By.cssSelector("input.login-btn"));

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String actualLoginText = loginButton.getAttribute("value");

        System.out.println("actualLoginText = " + actualLoginText);

        if(actualLoginText.equals(expectedText)){
            System.out.println("erification passed");
        }else {
            System.out.println("verification failed");
        }




    }
}
