package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScrollUp {
    ApiDemosPage apiDemosPage = new ApiDemosPage();

    @When("the user scrolls up to the top")
    public void theUserScrollsUpToTheTop() {
        apiDemosPage.scrollUp();
    }

    @Then("the user should be able to see {string} link")
    public void theUserShouldBeAbleToSeeAnimationLink(String string) {
        apiDemosPage.isAnimationVisible(string);
    }
}
