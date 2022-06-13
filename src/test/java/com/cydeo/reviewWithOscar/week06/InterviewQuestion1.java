package com.cydeo.reviewWithOscar.week06;

import com.cydeo.reviewWithOscar.week06.pomForReview.SearchResultPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class InterviewQuestion1 {

    @Test
    public void test(){
       // Go to https://www.webstaurantstore.com/

        Driver.getDriver().get("https://www.webstaurantstore.com/");
        //Search for 'stainless work table'
        SearchResultPage page = new SearchResultPage();
        page.searchBox.sendKeys("stainless work table" + Keys.ENTER);

        //Check the search result ensuring every product has the word 'Table' in its title

        List<WebElement> resultList = page.resultList;

        for (WebElement each : resultList) {
            Assert.assertTrue(each.getText().toLowerCase().contains("table"));


        }


        List<WebElement> inStockItems = page.inStockItems;
        inStockItems.get(inStockItems.size()-1).click();


        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.cart).perform();






        //Add the last of found items to Cart.
        //Empty Cart

        /*if you have an element that disappears and you need to locate it:
        1. click on sources at the inspect page
        2.hover over your webelement
       3. click F8 to stop of debugger of browser pauses the execution of the script
         */

    }



}
