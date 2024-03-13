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

    // Updating the date

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

    // Update time using clock

    @When("the user changes the time on the clock")
    public void the_user_changes_the_time() {
        dialogPage.openClock();
        dialogPage.updateTime();
        dialogPage.clickOkButton();
    }

    @Then("the updated time should be reflected at the top")
    public void the_updated_time_should_be_reflected_at_the_top() {
        assertTrue(dialogPage.isTimeUpdated("00:00"));
    }

    // Updating time using spinner

    @When("the user changes the time on the spinner")
    public void the_user_changes_the_time_on_the_spinner() throws InterruptedException {
        dialogPage.openTimeSpinner();
        dialogPage.spinToDesiredHour();
        dialogPage.spinToDesiredMinutes();
        dialogPage.clickOkButton();
        dialogPage.isTimeUpdated("21:59");
    }
}
