package com.cydeo.reviewWithOscar.week06.pomForReview;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
    public WebElement testAutomationBox;

    @FindBy(xpath = "//a[.='Contact us']")
    public WebElement contactUs;

    public WebElement getElement(String str){
        return Driver.getDriver().findElement(By.partialLinkText(str));

    }

    @FindBy(tagName = "a")
    public List<WebElement> links;











}
