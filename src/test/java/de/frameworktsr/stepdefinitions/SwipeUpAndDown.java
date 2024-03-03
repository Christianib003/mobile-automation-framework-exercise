package de.frameworktsr.stepdefinitions;

import static org.junit.Assert.assertTrue;

import de.frameworktsr.pages.ApiDemosPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwipeUpAndDown {
    ApiDemosPage apiDemosPage = new ApiDemosPage();

    @When("the user swipes up")
    public void the_user_swipes_up() {
        apiDemosPage.swipeToTheBottom();
    }

    @Then("the user should see all the elements at the bottom of the page")
    public void the_user_should_see_all_the_elements_at_the_bottom_of_the_page() {
        assertTrue(apiDemosPage.areBottomContentsDisplayed());
    }
}
