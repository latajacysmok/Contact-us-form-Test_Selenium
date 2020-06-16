package com.contactUs.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends PageObject{

    @FindBy(tagName = "h1")
    private WebElement headerPage;

    @FindBy(id = "id_contact")
    private WebElement subjectSendingInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "id_order")
    private WebElement idOrderReferenceInput;

    @FindBy(id = "message")
    private WebElement messageInput;

    @FindBy(id = "fileUpload")
    private WebElement fileUploadInput;

    @FindBy(id = "submitMessage")
    private WebElement submitButton;

    public ContactUsPage(WebDriver webDriver) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerPage,"CUSTOMER SERVICE - CONTACT US"));
    }

    public void subjectSendingInput(String subject) {
        new Select(subjectSendingInput).selectByVisibleText(subject);
    }

    public void enterEmailAddress(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enteridOrderReference(String order) {
        idOrderReferenceInput.clear();
        idOrderReferenceInput.sendKeys(order);
    }

    public void entermessage(String text) {
        messageInput.clear();
        messageInput.sendKeys(text);
    }

    public void uploadFile(String path) {
        fileUploadInput.sendKeys(path);
    }

    public SendMessagePage clickSubmit(){
        submitButton.click();
        return new SendMessagePage(webDriver);
    }

}
