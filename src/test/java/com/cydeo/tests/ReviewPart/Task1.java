package com.cydeo.tests.ReviewPart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password"));

        forgotPasswordLink.click();

       WebElement emailLink = driver.findElement(By.name("email"));

       emailLink.sendKeys("mike.smith@garbage.com" + Keys.ENTER);

       WebElement Actualmessage = driver.findElement(By.tagName("h4"));

       String actualMessagee = Actualmessage.getText();

       String expectedMessage = "Your e-mail's been sent!";

       if(actualMessagee.equals(expectedMessage)){
           System.out.println("verification passed");
       }else {
           System.out.println("verification failed");
       }

       Thread.sleep(3000);

       driver.close();




    }
}
