package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {

    @Test
    public void drag_and_drop_test(){

       Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());
     actions.dragAndDrop(smallCircle,bigCircle).perform();

        /*same
        actions.clickAndHold(smallCircle)
                .pause(2000)
                .moveToElement(bigCircle)
                .pause(2000)
                .release().perform();

         */

        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";


        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);







    }


}
