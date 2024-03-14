package de.frameworktsr.stepdefinitions;

import static org.junit.Assert.assertTrue;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.PushPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dropdown {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    PushPage  pushPage;
    @When("the user navigates to animation")
    public void the_user_navigates_to_animation() {
        apiDemosPage.navigateToAnimation();
    }

    @When("the user navigates to Push")
    public void the_user_navigates_to_push() {
        pushPage = apiDemosPage.navigateToPush();
    }

    @When("the user selects their preferred {string}")
    public void the_user_selects_their_preferred(String string) {
        pushPage.openDropdown();
        pushPage.selectAnimationType(string);
    }

    @Then("the correct {string} should be selected")
    public void the_should_be_selected(String string) {
        assertTrue(pushPage.isAnimationTypeSelected(string));
    }
}
