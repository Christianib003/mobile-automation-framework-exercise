package de.frameworktsr.stepdefinitions;

import static org.junit.Assert.assertTrue;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.PopupMenuPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PopUp {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    PopupMenuPage popupMenuPage;

    @When("the user navigates to Popup Menu")
    public void the_user_navigates_to_popup_menu() {
        apiDemosPage.scrollToPopUpMenuLink();
        popupMenuPage = apiDemosPage.navigateToPopupMenu();
    }

    @When("the user clicks on {string} button")
    public void the_user_clicks_on_button(String string) {
        popupMenuPage.openPopUp();
    }

    @Then("a popup with text {string} should be displayed")
    public void a_popup_with_text_should_be_displayed(String string) {
        assertTrue(popupMenuPage.isPopUpDisplayed());
    }
}
