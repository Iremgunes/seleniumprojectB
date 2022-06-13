package com.cydeo.tests.day13_review_interview;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick {
    //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
//2. Switch to iframe.
//3. Double click on the text “Double-click me to change my text color.”
// 4. Assert: Text’s “style” attribute value contains “red”.


    @Test
    public void t1_doble_click_test(){

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        Driver.getDriver().switchTo().frame("iframeResult");

        DoubleClickPage doubleClickPage = new DoubleClickPage();

        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(doubleClickPage.textDoubleClick).perform();

        System.out.println("doubleClickPage.textDoubleClick.getAttribute(\"style\") = "  + doubleClickPage.textDoubleClick.getAttribute("style") );

        String actualStyleAttributeValue = doubleClickPage.textDoubleClick.getAttribute("style");
        String expectedInStyleAttribute = "red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedInStyleAttribute));




    }




}
