package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.DragAndDropPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragAndDrop {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    DragAndDropPage dragDropPage;

    @When("the user naviagates to Drag and Drop page")
    public void userNavigatesToDragAndDropPage() {
        dragDropPage = apiDemosPage.navigateToDragAndDropPage();
    }

    @When("the user drags and drops the textless circle")
    public void userDragsAndDropTextlessCircle() {
        dragDropPage.dragAndDropTextLessCircle();
    }

    @Then("the message {string} should be displayed")
    public void theMessageShouldBeDisplayed(String string) {
        dragDropPage.isDragAndDropSuccessful(string);
    }
}
