package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PhotosPage extends BasePage {
    By firstImageBy = AppiumBy.xpath("//android.widget.ImageView[1]");
    By thirdImageBy = AppiumBy.xpath("//android.widget.ImageView[3]");

    public void swipeImageLeft() {
        swipe(firstImageBy, "left", 0.50);
    }

    public Boolean areOtherImagesDisplayed() {
        getElement(thirdImageBy);

        return true;
    }
}
