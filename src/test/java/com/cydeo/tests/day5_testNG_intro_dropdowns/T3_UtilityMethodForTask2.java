package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_UtilityMethodForTask2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

      //locate name ='sports' radio buttons and store them in a list of web element

        List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        //loop through list of web element and select matching result "hockey"
        /*
        for (WebElement each: sportRadioButtons){
            String eachId = each.getAttribute("id");

            System.out.println("eachId = " + eachId);

            if(eachId.equals("hockey")){
                each.click();
                System.out.println("hockey is selected : " + each.isSelected());
                break;
            }
        }

         */

        clickAndVerifyRadioButton(driver,"sport", "hockey");

        clickAndVerifyRadioButton(driver, "color", "yellow");






    }

    private  static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> RadioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each: RadioButtons){
            String eachId = each.getAttribute("id");

            System.out.println("eachId = " + eachId);

            if(eachId.equals(idValue)){
                each.click();
                System.out.println( eachId + " is selected : " + each.isSelected());
                break;
            }
        }
    }

}
