package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PhotosPage extends BasePage {
    By firstImageBy = AppiumBy.xpath("//android.widget.ImageView[1]");
    By thirdImageBy = AppiumBy.xpath("//android.widget.ImageView[3]");

    public void swipeImageLeft() {
        swipeElement(firstImageBy, "left", 0.50);
    }

    public Boolean areOtherImagesDisplayed() {
        getElement(thirdImageBy);

        return true;
    }

    public void swipeImageRight() {
        swipeElement(thirdImageBy, "right", 0.50);
    }

    public Boolean isFirstImageDisplayed() {
        getElement(firstImageBy);

        return true;
    }
}
