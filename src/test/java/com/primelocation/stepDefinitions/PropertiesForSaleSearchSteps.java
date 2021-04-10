package com.primelocation.stepDefinitions;

import com.primelocation.pages.BasePage;
import com.primelocation.pages.HomePage;
import com.primelocation.pages.PropertiesForSalePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;

public class PropertiesForSaleSearchSteps extends BasePage
{
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    PropertiesForSalePage propertiesForSalePage = PageFactory.initElements(driver, PropertiesForSalePage.class);
    @Given("And I click on For Sale tab")
    public void andIClickOnForSaleTab()
    {
        homePage.hooverOverForSaleTab();
        propertiesForSalePage = homePage.clickOnForSalelink();

    }

}
