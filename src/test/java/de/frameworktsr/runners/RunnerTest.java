package de.frameworktsr.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/de/frameworktsr/app/features", glue = "de.frameworktsr.stepdefinitions", plugin = {
        "pretty", "html:target/reports/html-report.html", "json:target/reports/json-report.html" })
public class RunnerTest {

}
