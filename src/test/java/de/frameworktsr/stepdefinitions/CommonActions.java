package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import io.cucumber.java.en.When;

public class CommonActions {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    
    @When("the user navigates to Views")
    public void userNavigatesToViews() {
        apiDemosPage.navigateToviews();
    }
}
