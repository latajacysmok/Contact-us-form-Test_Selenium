package com.contactUs.step;

import com.contactUs.config.WebDriverType;
import com.contactUs.page.ContactUsPage;
import com.contactUs.page.HomePage;
import io.cucumber.core.api.Scenario;
import io.cucumber.java8.En;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;

public class CommonStep implements En {
    private Scenario scenario;
    private WebDriver webDriver;
    private HomePage homePage;

        public CommonStep() {
        Before("@scenario", scenario-> this.scenario = scenario);
        After("@scenario", ()->{
            if(scenario.isFailed()){
                scenario.embed(((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BYTES), "image/png");
            }
            webDriver.quit();
        });
        Given("I navigate to {string} using {string}", (String url, String browser) -> {
            webDriver = WebDriverType.valueOf(browser).create();
            webDriver.get(url);
            homePage = new HomePage(webDriver);
        });
    }
    public HomePage getHomePage() {
        return homePage;
    }
    }
