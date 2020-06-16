package com.contactUs.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageObject{

    @FindBy(tagName = "h1")
    private WebElement headerPage;
    @FindBy(id = "contact-link")
    private WebElement contactUsButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerPage,"Automation Practice Website"));
    }
    public ContactUsPage clickContactUs(){
        contactUsButton.click();
        return new ContactUsPage(webDriver);
    }

}
