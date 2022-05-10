package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement usernameButton = driver.findElement(By.name("USER_LOGIN"));
        usernameButton.sendKeys("incorrect");

        WebElement passwordButton = driver.findElement(By.name("USER_PASSWORD"));
        passwordButton.sendKeys("incorrect"  );

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        String expectedMessage = "Incorrect login or password";

        WebElement actualMessageElement = driver.findElement(By.className("errortext"));

        String actualmessage = actualMessageElement.getText();

        if(actualmessage.equals(expectedMessage)){
            System.out.println("well done !!!");
        } else{
            System.err.println("failed");
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();


    }




}
