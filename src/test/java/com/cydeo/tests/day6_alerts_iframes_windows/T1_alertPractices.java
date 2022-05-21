package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_alertPractices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test() throws InterruptedException {

        Thread.sleep(2000);
     // 3. Click to “Click for JS Alert” button
        WebElement jsAlertButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        jsAlertButton.click();

        //to be able to click to alert ok button we need to switch driver s focus to alert itself
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);

        //4. Click to OK button from the alert
        alert.accept();

     //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement textMessage = driver.findElement(By.xpath("//p[@id='result']"));

        System.out.println(" 'You successfully clicked an alert' text is displayed : " + textMessage.isDisplayed());



    }






    }

