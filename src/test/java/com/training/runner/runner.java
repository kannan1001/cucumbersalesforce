package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features//"},
                 glue = {"com.training.steps"},
                 plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                                    "json:target/cucumber-report/cucumber.json"} )
								
public class runner {

}
