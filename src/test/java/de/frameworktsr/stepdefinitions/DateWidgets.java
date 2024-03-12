package de.frameworktsr.stepdefinitions;

import static org.junit.Assert.assertTrue;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.DialogPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DateWidgets {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    DialogPage dialogPage;

    @When("the user navigates to Date Widgets")
    public void the_user_navigates_to_date_widgets() {
        apiDemosPage.navigateToDateWidgets();
    }

    @When("the user navigates to Dialog")
    public void the_user_navigates_to_dialog() {
        dialogPage = apiDemosPage.navigateToDialog();
    }

    @When("the user changes the date")
    public void the_user_changes_the_date_using_caledar() {
        dialogPage.openCalendar();
        dialogPage.selectDesiredDate();
        dialogPage.clickOkButton();
    }

    @Then("the updated date should be reflected at the top")
    public void the_updated_date_should_be_reflected_at_the_top() {
        assertTrue(dialogPage.isDateUpdated());
    }
}
