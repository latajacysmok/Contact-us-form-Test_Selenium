package com.contactUs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/report"}, features = "classpath:features", glue = "com.contactUs.step"
//        ,dryRun = false
)

public class RunTest {
}
