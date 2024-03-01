package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.RadioGroupPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChooseFood {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    RadioGroupPage radioGroupPage;

    @When("the user navigates to Radio Group")
    public void the_user_navigates_to_radio_group() {
        radioGroupPage = apiDemosPage.navigateToRadioGroup();
    }

    @When("the user chooses the type of food as {string}")
    public void the_user_chooses_the_type_of_food_as(String string) {
        radioGroupPage.chooseFoodType(string);
    }

    @Then("the {string} should be selected")
    public void the_food_type_should_be_selected(String string) {
        radioGroupPage.checkIfCorrectFoodIsSelected(string);
    }

    @Then("the user should be able to clear their selection")
    public void the_user_should_be_able_to_clear_their_selection() {
        radioGroupPage.areAllOptionsCleared();
    }
}
