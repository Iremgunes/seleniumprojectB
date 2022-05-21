package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowsPractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

    }


    @Test
    public void test_5() throws InterruptedException {

        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //  4. Assert: Title is “Windows”
        //Assert.assertTrue(driver.getTitle().equals("Windows"));
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title before click : " + actualTitle);

        Thread.sleep(2000);

        //  5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.xpath("//a[@href='/windows/new\']"));
        clickHereLink.click();


        //   6. Switch to new Window.
        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);
            System.out.println("current title while switching windows: " + driver.getTitle());
        }

        //   7. Assert: Title is “New Window”


        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitleAfterClick);
        System.out.println("title after click : " + actualTitle);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}