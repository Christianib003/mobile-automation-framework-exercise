package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScrollDown {
    ApiDemosPage apiDemosPage = new ApiDemosPage();

    @When("the user scrolls down")
    public void theUserScrollsDown() {
        apiDemosPage.scrollDown();
    }

    @Then("the user should be able to see {string} link at the top")
    public void the_user_should_be_able_to_see_link(String string) {
        apiDemosPage.isTextClockVisible(string);
    }
}
