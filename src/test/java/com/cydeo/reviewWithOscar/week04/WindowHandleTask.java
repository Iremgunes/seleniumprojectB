package com.cydeo.reviewWithOscar.week04;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTask {

    @Test
    public void windowHandleTest() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://shino.de/parkcalc/");

        driver.findElement(By.xpath("(//img[@src='cal.gif'])[1]")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("windowHandles = " + windowHandles);

        //get your cureent window handle
        String mainWindowHandle = driver.getWindowHandle();

        // to switch to window which we are not at
        for (String eachWindowHandle:windowHandles) {
            if (!(eachWindowHandle.equals(mainWindowHandle))){
                driver.switchTo().window(eachWindowHandle);
            }
        }

        //click on the element at the second window
        driver.findElement(By.linkText("24")).click();
        ReviewUtils.staticWait(3);
//the window closes itself, however i am still inside that closed window/
// /programatically

        driver.switchTo().window(mainWindowHandle);



       WebElement pmButton = driver.findElement(By.xpath("(//input[@name='StartingTimeAMPM'])[2]"));
       pmButton.click();
        ReviewUtils.staticWait(2);

        Assert.assertTrue(pmButton.isSelected());


        driver.quit();







    }
}
