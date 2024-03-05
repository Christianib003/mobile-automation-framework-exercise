package de.frameworktsr.stepdefinitions;

import static org.junit.Assert.assertTrue;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.ExpandableListsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LongClick {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    ExpandableListsPage expandableListsPage;

    @When("the user navigates to expandable lists")
    public void the_user_navigates_to_expandable_lists() {
        apiDemosPage.navigateToExpandableLists();
    }

    @When("the user navigates to Custom Adapter")
    public void the_user_navigates_to_custom_adapter() {
        expandableListsPage = apiDemosPage.navigateToCustomerAdapter();
    }

    @When("the user long clicks on People Names")
    public void the_user_long_clicks_on_people_names() {
        expandableListsPage.longClickPeopleNames();
    }

    @Then("sample menu popup should be displayed")
    public void sample_menu_popup_should_be_displayed() {
        assertTrue(expandableListsPage.isPopUpDisplayed());
    }
}
