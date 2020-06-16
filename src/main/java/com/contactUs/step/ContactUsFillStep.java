package com.contactUs.step;

import io.cucumber.java8.En;

public class ContactUsFillStep implements En {


    public ContactUsFillStep(ContactUsStep contactUsStep) {
        And("Fill filling out the application form", () -> {
            contactUsStep.getContactUspage().subjectSendingInput("Customer service");
            contactUsStep.getContactUspage().enterEmailAddress("dummyEmailAdress@gmail.com");
            contactUsStep.getContactUspage().enteridOrderReference("dwr764348");
            contactUsStep.getContactUspage().uploadFile("C:\\Users\\Admin\\Downloads\\oak.jpg");
            contactUsStep.getContactUspage().entermessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
                }

        );
    }





}
