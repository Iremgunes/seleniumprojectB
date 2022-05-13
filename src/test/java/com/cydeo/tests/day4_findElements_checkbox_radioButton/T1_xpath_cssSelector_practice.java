package com.cydeo.tests.day4_findElements_checkbox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 1. Open Chrome browser
        // 2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)

/*

        4. Verify all web elements are displayed.

 */
       // a. “Home” link
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class = 'nav-link']"));
        WebElement homelink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homelink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        WebElement forgotPasswordHeader_ex1 = driver.findElement(By.cssSelector("div.example > h2"));
        //using xpath

        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()= 'Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel_ex1= driver.findElement(By.xpath("//input[@for='email']"));

        //d. E-mail input box
        WebElement inputBox_ex1= driver.findElement(By.xpath("//input[@name='email']"));
        //ex2
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@name,'email')]"));

       // e. “Retrieve password” button
        WebElement retrievePassword_ex1 = driver.findElement(By.cssSelector("button[id='form_submit']"));
        //ex2

        WebElement retrievePassword_ex2 = driver.findElement(By.cssSelector("button#form_submit"));


       // f. “Powered by Cydeo text



    }
}
