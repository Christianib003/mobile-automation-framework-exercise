package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DialogPage extends BasePage {
    By changeDateBtnBy = AppiumBy.accessibilityId("change the date");
    By desiredDateBy = AppiumBy.accessibilityId("31 March 2024");
    By okBtnBy = AppiumBy.id("android:id/button1");
    By dateDisplayContainerBy = AppiumBy.id("io.appium.android.apis:id/dateDisplay");
    By changeTimeUsingClockBtnBy = AppiumBy.accessibilityId("change the time");
    By twelveOClockBy = AppiumBy.accessibilityId("12");
    By zeroMinutesBy = AppiumBy.accessibilityId("0");

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

    public void openClock() {
        click(changeTimeUsingClockBtnBy);
    }

    public void updateTime() {
        click(twelveOClockBy); // select 12h
        click(zeroMinutesBy); // select 00
    }

    public String getDisplayedTime() {
        String displayedTime = getTextAttribute(dateDisplayContainerBy).substring(10);

        return displayedTime;
    }

    public Boolean isTimeUpdated() {
        return getDisplayedTime().equals("00:00");
    }
}
