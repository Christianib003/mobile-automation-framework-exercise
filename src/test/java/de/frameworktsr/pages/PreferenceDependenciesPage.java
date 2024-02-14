package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PreferenceDependenciesPage extends BasePage {
    By activateWifiSettingsCheckboxBy = AppiumBy.id("android:id/checkbox");
    By wifiSettingsLinkBy = AppiumBy.xpath("//android.widget.TextView[@text='WiFi settings']");
    By wifiSettingInputAreaBy = AppiumBy.id("android:id/edit");
    By okBtnBy = AppiumBy.id("android:id/button1");

    public void activateWifiSettings() {
        click(activateWifiSettingsCheckboxBy);
    }

    public void openWifiSettingsPopUp() {
        click(wifiSettingsLinkBy);
    }

    public void addNewWifiSetting() {
        addTextToField(wifiSettingInputAreaBy, "RK");
        click(okBtnBy);
    }

    public Boolean isWifiSettingSaved(String expectedWifiSetting) {
        String currentWifiSetting = getAttributeValue(wifiSettingInputAreaBy, "text");
        checkSimilarityOfText(currentWifiSetting, expectedWifiSetting);

        return true;
    }
}
