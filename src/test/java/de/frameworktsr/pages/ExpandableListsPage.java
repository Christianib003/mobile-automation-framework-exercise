package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ExpandableListsPage extends BasePage {
    By peopleNamesBy = AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]");
    By searchMenuLinkBy = AppiumBy.xpath("//android.widget.TextView[@text=\"Sample menu\"]");

    public void longClickPeopleNames() {
        longClick(peopleNamesBy);
    }

    public Boolean isPopUpDisplayed() {
        return getElement(searchMenuLinkBy).isDisplayed();
    }
}
