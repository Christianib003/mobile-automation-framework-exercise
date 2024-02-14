package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.PreferenceDependenciesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PopUp {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    PreferenceDependenciesPage preferenceDependenciesPage;
    @When("the user navigates to Prefence")
    public void theUserNavigatesToPrefence() {
        apiDemosPage.navigateToPreferences();
    }

    @When("the user naviagtes to Preference dependencies")
    public void theUserNaviagtesToPreferenceDependencies() {
        preferenceDependenciesPage = apiDemosPage.navigateToPreferenceDependencies();
    }

    @When("the user activates the WIFI settings")
    public void theUserActivatesTheWifiSettings() {
        preferenceDependenciesPage.activateWifiSettings();
    }

    @When("the user taps on WIFI settings")
    public void theUserTapsOnWifiSettings() {
        preferenceDependenciesPage.openWifiSettingsPopUp();
    }

    @When("the user enters and saves {string} as a WIFI setting")
    public void theUserEntersAndSavesWifiSetting(String string) {
        preferenceDependenciesPage.addNewWifiSetting();
    }

    @Then("WIFI setting {string} should be saved")
    public void wifiSettingShouldBeSaved(String string) {
        preferenceDependenciesPage.openWifiSettingsPopUp();
        preferenceDependenciesPage.isWifiSettingSaved(string);
    }
}
