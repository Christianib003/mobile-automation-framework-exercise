package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DialogPage extends BasePage {
    By changeDateBtnBy = AppiumBy.accessibilityId("change the date");
    By desiredDateBy = AppiumBy.accessibilityId("31 March 2024");
    By okBtnBy = AppiumBy.id("android:id/button1");
    By dateDisplayContainerBy = AppiumBy.id("io.appium.android.apis:id/dateDisplay");

    public void openCalendar() {
        click(changeDateBtnBy);
    }

    public void selectDesiredDate() {
        click(desiredDateBy);
    }

    public void clickOkButton() {
        click(okBtnBy);
    }

    public String getDisplayedDate() {
        String displayedDate = getTextAttribute(dateDisplayContainerBy).substring(0, 4);

        return displayedDate;
    }

    public Boolean isDateUpdated() {
        return getDisplayedDate().equals("3-31");
    }
}
