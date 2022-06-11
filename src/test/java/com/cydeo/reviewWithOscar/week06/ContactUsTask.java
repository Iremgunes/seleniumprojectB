package com.cydeo.reviewWithOscar.week06;

import com.cydeo.reviewWithOscar.week06.pomForReview.ContactUsPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.ReviewUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTask {

    @Test
    public void Test(){

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get("http://automationexercise.com");
// 3. Verify that home page is visible successfully

        Assert.assertTrue(Driver.getDriver().getTitle().equals("Automation Exercise"));

        ContactUsPage page = new ContactUsPage();

        page.getElement("Contact us").click();
//4. Click on 'Contact Us' button

//5. Verify 'GET IN TOUCH' is visible

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReviewUtils.staticWait(2);
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();
        ReviewUtils.staticWait(2);
        //2. way
        actions.moveToElement(page.submit).perform();
        //3. way
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        jse.executeScript("window.scrollBy(0,750)");
        ReviewUtils.staticWait(1);
        jse.executeScript("window.scrollBy(0,-750)");
        ReviewUtils.staticWait(1);

//6. Enter name, email, subject and message
        Faker faker = new Faker();

        page.name.sendKeys(faker.name().fullName());
        page.email.sendKeys(faker.internet().emailAddress());
        page.subject.sendKeys(faker.chuckNorris().fact());
        page.message.sendKeys(faker.howIMetYourMother().catchPhrase());

//7. Upload file
        String path = "C:\\Users\\DELL\\Desktop\\CYBERTEK SCHOOL\\HTML Class\\flower.jpg";

        page.uploadFile.sendKeys(path);

        page.submit.click();

//8. Click 'Submit' button

        //we get js alert
        Alert alert = Driver.getDriver().switchTo().alert();

        alert.accept();

//9. Click OK button
        String expectedValue="Success! Your details have been submitted successfully.";
        String actualValue= page.success.getText();

        Assert.assertTrue(expectedValue.equals(actualValue));


        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible

        page.home.click();



//11. Click 'Home' button and verify that landed to home pag






    }





}
