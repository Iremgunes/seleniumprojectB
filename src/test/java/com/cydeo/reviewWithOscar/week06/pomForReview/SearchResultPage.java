package com.cydeo.reviewWithOscar.week06.pomForReview;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends HomePage{

@FindBy(xpath = "//a[@data-testid='itemDescription']")
    public List<WebElement> resultList;


@FindBy(xpath = "//input[@data-testid='itemAddCart']")
    public List<WebElement> inStockItems;


@FindBy(xpath = "//span[.='Cart']")
    public WebElement cart;



}
