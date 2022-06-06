package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
    creating a private constructor so we are closing
    access to object of this class from outside of the class

     */
    private Driver(){}

    /*
    we make webdriver private because we want to close access from outside a class
     we make it static because we will use it in static method
     */
    private static WebDriver driver;

    /*
    create a reuasable utility method which will return same driver instance when we call it
     */
    public static WebDriver getDriver(){

        if(driver==null){

            /*
            we read our browserType from configuration.properties.
            this way, we can control which browser is opened from outside our code from configuration.properties.
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            depending on the browserType taht will be return from configuration.properties file
            switch statement will determine the case, and open the matching browser
             */
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }
        }
        return driver;
    }

}
