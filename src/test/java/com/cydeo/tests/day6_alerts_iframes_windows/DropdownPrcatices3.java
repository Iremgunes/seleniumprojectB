package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPrcatices3 {

    @Test
    public void task_7(){
       // 1. Open Chrome browser
       // 2. Go to https://practice.cydeo.com/dropdown
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");

      //  3. Click to non-select dropdown

      //  4. Select Facebook from dropdown
      //  5. Verify title is “Facebook - Log In or Sign Up”

    }
}
