package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    @Test
    public void dropdown_task5() throws InterruptedException {
        //. Open Chrome browser

      //  2. Go to http://practice.cybertekschool.com/dropdown

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(1000);

        // 3. Select Illinois
        stateDropdown.selectByVisibleText("Illinois");
            Thread.sleep(1000);

        //4. Select Virginia
        stateDropdown.selectByValue("VA");
        Thread.sleep(1000);

        //5. Select California
        stateDropdown.selectByIndex(5);


        //6. Verify final selected option is California.
        String expectedSelectedOption = "California";
        String actualSelectedOption = stateDropdown.getFirstSelectedOption().getText();

        System.out.println("actualSelectedOption = " + actualSelectedOption);

        Assert.assertEquals(actualSelectedOption, expectedSelectedOption);



    }
}
