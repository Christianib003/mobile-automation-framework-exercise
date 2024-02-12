package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ApiDemosPage extends BasePage {
    By viewsLinkBy = AppiumBy.accessibilityId("Views");
    By dragAndDropLinkBy = AppiumBy.accessibilityId("Drag and Drop");
    By textlessCircleBy = AppiumBy.id("io.appium.android.apis:id/drag_dot_1");
    By dragAndDropMessageContainerBy = AppiumBy.id("io.appium.android.apis:id/drag_result_text");

    public void navigateToviews() {
        click(viewsLinkBy);
    }

    public void navigateToDragAndDropPage() {
        click(dragAndDropLinkBy);
    }

    public void dragAndDropTextLessCircle() {
        dragAndDrop(textlessCircleBy, 800, 1300);
    }

    public Boolean isDragAndDropSuccessful(String expectedMessage) {
        String actualMessage = getTextAttribute(dragAndDropMessageContainerBy);
        checkSimilarityOfText(expectedMessage, actualMessage);

        return true;
    }
}
