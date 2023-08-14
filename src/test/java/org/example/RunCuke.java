package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", tags = "@emailAFriend",
        plugin = {"pretty", "html:target/cucumber-html-report.html","json:target/cucumber.json"})

public class RunCuke {

}
