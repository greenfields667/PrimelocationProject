package com.primelocation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage
{
    public SearchResultPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    private WebElement pageTitle;
    @FindBy(className = "price")
    private List<WebElement> results;
    @FindBy(css = ".layout-fullwidth.brand-primelocation")
    private List<WebElement> searchResults;


    public void isSearchResultCorrect(String text)

    {
        pageTitle.getText().contains(text);
    }

    public void isResultDisplayed()

    {
        Assert.assertTrue(results.size()> 0);
    }

    public ProductDetailPage clickOnRandomResult()
    {
        Random ran = new Random();
        int randomNumber = ran.nextInt(results.size()-1);
        //randomNumber = ran.nextInt(6);
        results.get(randomNumber).click();

        return new ProductDetailPage(driver);

    }



}
