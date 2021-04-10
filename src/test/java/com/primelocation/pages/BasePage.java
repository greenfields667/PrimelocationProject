package com.primelocation.pages;

import com.primelocation.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager
{
    public String BASE_URL ="https://www.primelocation.com/";
    public Select select;
    public Actions actions;
    public void launchUrl()
    {

        driver.navigate().to(BASE_URL);
    }

    //selectByVisibleText
    // selectByIndex
    // selectByValue

    public void selectElementByText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);

    }

    public void hooverOverElement(WebElement element)
    {
        actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

}


