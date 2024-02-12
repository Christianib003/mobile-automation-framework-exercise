package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragAndDrop {
    ApiDemosPage apiDemosPage = new ApiDemosPage();

    @When("the user navigates to Views")
    public void userNavigatesToViews() {
        apiDemosPage.navigateToviews();
    }

    @When("the user naviagates to Drag and Drop page")
    public void userNavigatesToDragAndDropPage() {
        apiDemosPage.navigateToDragAndDropPage();
    }

    @When("the user drags and drops the textless circle")
    public void userDragsAndDropTextlessCircle() {
        apiDemosPage.dragAndDropTextLessCircle();
    }

    @Then("the message {string} should be displayed")
    public void theMessageShouldBeDisplayed(String string) {
        apiDemosPage.isDragAndDropSuccessful(string);
    }
}