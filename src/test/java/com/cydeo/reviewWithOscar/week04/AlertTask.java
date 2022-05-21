package com.cydeo.reviewWithOscar.week04;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTask {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
    driver= WebDriverFactory.getDriver("cHROME");
    driver.manage().window().maximize();
    }

    @Test
    public void alertTest(){

        driver.get("https://www.demoblaze.com/index.html");

        ReviewUtils.getLink(driver, "Laptops");

        ReviewUtils.getLink(driver, "Sony vaio i5");

        ReviewUtils.getLink(driver, "Add to cart");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.close();




    }

}
