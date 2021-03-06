package com.cydeo.tests.day4_findElements_checkbox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_findElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/abtest");

       // Locate all the links in the page.
        List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
       // 4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

      //  5- Print out the texts of the links.
        for (WebElement each : allLinks) {
            System.out.println("text of link: " + each.getText());
            System.out.println("HREF Values : " + each.getAttribute("href"));
        }

       // 6- Print out the HREF attribute values of the links


        driver.close();



    }
}
