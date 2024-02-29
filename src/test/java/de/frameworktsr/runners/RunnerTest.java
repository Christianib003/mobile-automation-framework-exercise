package de.frameworktsr.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/de/frameworktsr/features", glue = { "de.frameworktsr.stepdefinitions",
                "de.frameworktsr.hooks", "de.frameworktsr.pages" }, plugin = {
                                "pretty", "html:target/reports/html-report.html",
                                "json:target/reports/json-report.html" })
public class RunnerTest {

}
