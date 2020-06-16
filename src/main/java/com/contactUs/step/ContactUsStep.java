package com.contactUs.step;

import com.contactUs.page.ContactUsPage;
import io.cucumber.java8.En;

public class ContactUsStep implements En {

    private ContactUsPage contactUspage;

    public ContactUsStep(CommonStep commonStep) {
        When("I click {string} button", (String button) -> {
            contactUspage = commonStep.getHomePage().clickContactUs();
        });
    }

    public ContactUsPage getContactUspage() {
        return contactUspage;
    }
}
