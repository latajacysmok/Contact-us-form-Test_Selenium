package com.contactUs.step;

import io.cucumber.java8.En;

public class SendMessageStep implements En {
    public SendMessageStep(ContactUsStep contactUsStep) {
        Then("I can send message", () -> {
            contactUsStep.getContactUspage().clickSubmit();
        });
    }
}
