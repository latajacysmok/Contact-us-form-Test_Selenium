package com.contactUs.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SendMessagePage extends PageObject{

    @FindBy(tagName = "h1")
    private WebElement headerPage;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement alertMessage;

    public SendMessagePage(WebDriver webDriver) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerPage,"CUSTOMER SERVICE - CONTACT US"));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(alertMessage,"Your message has been successfully sent to our team."));
    }
}
