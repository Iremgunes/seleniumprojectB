package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables ");
    }

    @Test
    public void order_name_verify_test(){
       // Verify Bob’s name is listed as expected.
       // Expected: “Bob Martin”

        WebElement BobMartinCell = driver.findElement(By.xpath("//table[@class='SampleTable']//tbody/tr[7]/td[2]"));
//*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[7]/td[2]
        System.out.println("BobMartinCell.getText() = " + BobMartinCell.getText());

        String expectedBobName = "Bob Martin";
        String actualBobName = BobMartinCell.getText();

        Assert.assertEquals(actualBobName,expectedBobName);

        // 3. Verify Bob Martin’s order date is as expected
       // Expected: 12/31/2021

        WebElement dateCell = driver.findElement(By.xpath("//table[@class='SampleTable']//tbody/tr[7]/td[5]"));

        WebElement dateCell2version = driver.findElement(By.xpath("//table[@class='SampleTable']//tbody/tr[7]/td[2]/following-sibling::td[3]"));

        Assert.assertEquals(dateCell, dateCell2version);

        String actualBobDate = dateCell.getText();
        String expectedBobDate = "12/31/2021";

        Assert.assertEquals(actualBobDate, expectedBobDate);

    }

    @Test
    public void test2(){
        String costumerOrderDate1 = WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        String costumerOrderDate2 = WebTableUtils.returnOrderDate(driver,"Bob Martin");

        System.out.println("costumerOrderDate1 = " + costumerOrderDate1);

        System.out.println("costumerOrderDate2 = " + costumerOrderDate2);
    }

    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver, "Bart Fisher", "01/16/2021");


    }



}
