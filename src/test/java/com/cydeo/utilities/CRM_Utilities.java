package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /*
    this method will login with helpdesk1 user
    whne it is called
     */
    public static void crm_login(WebDriver driver){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys("UserUser");

        WebElement logınButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logınButton.click();

    }

    public static void crm_login(WebDriver driver, String username, String password){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys(password);

        WebElement logınButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logınButton.click();

    }




}
