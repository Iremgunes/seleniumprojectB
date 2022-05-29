package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

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

}
