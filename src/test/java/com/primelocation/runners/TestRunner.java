package com.primelocation.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/primelocation/features"},
        glue = {"com/primelocation/hooks", "com/primelocation/stepDefinitions"},
        publish = true,
        tags = "not @ignore"
)
public class TestRunner {
}
