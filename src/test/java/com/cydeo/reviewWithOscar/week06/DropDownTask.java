package com.cydeo.reviewWithOscar.week06;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTask {
   //  1. Go to:  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
     // 2. Login with username: Tester, password: test
   // 3. Click  Order button
  //  4. Verify under Product Information, selected option is “MyMoney”
 //          5. Then select FamilyAlbum, make quantity 2, and click Calculate,
  //          6. Then verify Total is equal to Quantity*PricePerUnit


    @Test
    public void task(){

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test", Keys.ENTER);

        Driver.getDriver().findElement(By.partialLinkText("Order")).click();

        WebElement dropdownElement = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));

        Select dropDown = new Select(dropdownElement);

        dropDown.selectByIndex(0);

    }


}
