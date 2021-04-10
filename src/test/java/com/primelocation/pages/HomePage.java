package com.primelocation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    //constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "search-input-location")
    private WebElement searchField;
    @FindBy(css = ".btn.button.btn-highlight.js-cookie-policy-close")
    private WebElement cookiepolicy;
    @FindBy(name = "price_min")
    private WebElement minPrice;
    @FindBy(css = "[href=\"/for-sale/\"]")
    private WebElement forSaleTab;
    @FindBy(name = "price_max")
    private WebElement maxPrice;
    @FindBy(name = "property_type")
    private WebElement propertyType;
    @FindBy(name = "beds_min")
    private WebElement noOfBed;
    @FindBy(id = "search-submit")
    private WebElement searchButton;
    @FindBy(css = ".layout-fullwidth.brand-primelocation")
    private WebElement getForSaleTab;


    public void enterLocation(String location)
    {
        searchField.sendKeys(location);
        searchField.click();
    }

    public void clickOnCookiePolicy()
    {
        cookiepolicy.click();
    }

    public void selectMinimum(String text)
    {
        selectElementByText(minPrice, text);
    }

    public ForSaleSearchPage clickOnForSaleTab()
    {
    forSaleTab.click();
        return new ForSaleSearchPage(driver);
    }

    public void setMaxPrice(String text)
    {
        selectElementByText(maxPrice, text);

    }

    public void selectPropertyType(String text)
    {
        selectElementByText(propertyType, text);
    }

    public void selectnoOfBed(String text)
    {
        selectElementByText(noOfBed, text);
    }

    public SearchResultPage clickOnSearchButton()
    {
        searchButton.click();
        return new SearchResultPage(driver);
    }

    public void hooverOverForSaleTab()
    {
        hooverOverElement(forSaleTab);
    }

    public PropertiesForSalePage clickOnForSalelink()
    {
        forSaleTab.click();
        return new PropertiesForSalePage(driver);
    }
}
