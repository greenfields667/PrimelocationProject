package com.primelocation.stepDefinitions;

import com.primelocation.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ForSaleSearchSteps extends BasePage
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    ForSaleSearchPage forSaleSearchPage = PageFactory.initElements(driver, ForSaleSearchPage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
    ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);

    @Given("I navigate to Primelocation homepage")
    public void i_navigate_to_primelocation_homepage() {
        launchUrl();
        homePage.clickOnCookiePolicy();

    }
    @When("I click on For Sale Tab")
    public void i_click_on_for_sale_tab() {
    forSaleSearchPage=homePage.clickOnForSaleTab();
    }

    @And("I enter {string} into the search field")
    public void i_enter_into_the_search_field(String location) {
        forSaleSearchPage.enterLocation(location);

    }

    @And("I select minimum price {string}")
    public void i_select_minimum_price (String minPrice) {
        homePage.selectMinimum(minPrice);

    }

    @And("I select maximum price {string}")
    public void i_select_maximum_price(String maxPrice) {
        homePage.setMaxPrice(maxPrice);

    }

    @And("I select {string} for property type")
    public void i_select_for_property_type(String prop) {
        homePage.selectPropertyType(prop);

    }

    @And("I select {string} bedrooms type")
    public void i_select_bedrooms_type(String bed) {
        homePage.selectnoOfBed(bed);

    }

    @When("I click on search button")
    public void i_click_on_search_button() {
        searchResultPage = homePage.clickOnSearchButton();

    }

    @Then("the result for {string} for sale in {string} is displayed")
    public void the_result_for_for_sale_in_is_displayed(String propertyType, String location) {
        searchResultPage.isSearchResultCorrect(propertyType);
        searchResultPage.isSearchResultCorrect(location);

    }

    @When("result is displayed for the search above")
    public void result_is_displayed_for_the_search_above() {
        searchResultPage.isResultDisplayed();

    }

    @When("I click on one of the results displayed")
    public void i_click_on_one_of_the_results_displayed() {
        productDetailPage = searchResultPage.clickOnRandomResult();

    }

    @Then("the details of the property clicked on is displayed")
    public void the_details_of_the_property_clicked_on_is_displayed() {

    }



}
