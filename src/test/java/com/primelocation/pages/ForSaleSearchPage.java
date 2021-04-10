package com.primelocation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForSaleSearchPage extends BasePage
{
    public ForSaleSearchPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "search-input-location")
    private WebElement searchField;





    public void enterLocation(String location)
    {
        searchField.sendKeys(location);
        searchField.click();
    }
}
