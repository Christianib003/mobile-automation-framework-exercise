package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PopupMenuPage extends BasePage {
    By makePopupBtnBy = AppiumBy.accessibilityId("Make a Popup!");
    By searchLinkBy = AppiumBy.xpath("//android.widget.TextView[@text=\"Search\"]");

    public void openPopUp() {
        click(makePopupBtnBy);
    }

    public Boolean isPopUpDisplayed() {
       return getElement(searchLinkBy).isDisplayed();
    }
}
