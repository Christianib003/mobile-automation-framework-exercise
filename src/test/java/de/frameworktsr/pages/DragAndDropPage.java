package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DragAndDropPage extends BasePage {
    By textlessCircleBy = AppiumBy.id("io.appium.android.apis:id/drag_dot_1");
    By dragAndDropMessageContainerBy = AppiumBy.id("io.appium.android.apis:id/drag_result_text");

    public void dragAndDropTextLessCircle() {
        dragAndDropUsingElementId(textlessCircleBy, 800, 1300);
        // dragAndDropUsingCoordinates(271, 790, 1000, 2507);
    }

    public Boolean isDragAndDropSuccessful(String expectedMessage) {
        String actualMessage = getTextAttribute(dragAndDropMessageContainerBy);
        checkSimilarityOfText(expectedMessage, actualMessage);

        return true;
    }
}
