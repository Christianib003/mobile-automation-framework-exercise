package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PopUp {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    @When("the user navigates to Prefence")
    public void theUserNavigatesToPrefence() {
        apiDemosPage.navigateToPreferences();
    }

    @When("the user naviagtes to Preference dependencies")
    public void theUserNaviagtesToPreferenceDependencies() {

    }

    @When("the user activates the WIFI settings")
    public void theUserActivatesTheWifiSettings() {

    }

    @When("the user taps on WIFI settings")
    public void theUserTapsOnWifiSettings() {

    }

    @When("the user enters and saves {string} as a WIFI setting")
    public void theUserEntersAndSavesWifiSetting(String string) {

    }

    @Then("WIFI setting {string} should be saved")
    public void wifiSettingShouldBeSaved(String string) {

    }
}
