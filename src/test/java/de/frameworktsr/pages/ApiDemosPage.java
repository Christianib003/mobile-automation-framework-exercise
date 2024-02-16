package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ApiDemosPage extends BasePage {
    By viewsLinkBy = AppiumBy.accessibilityId("Views");
    By dragAndDropLinkBy = AppiumBy.accessibilityId("Drag and Drop");
    By preferenceLinkBy = AppiumBy.accessibilityId("Preference");
    By preferenceDependenciesLinkBy = AppiumBy.accessibilityId("3. Preference dependencies");
    By linksContainerBy = AppiumBy.id("android:id/content");

    public void navigateToviews() {
        click(viewsLinkBy);
    }

    public DragAndDropPage navigateToDragAndDropPage() {
        click(dragAndDropLinkBy);

        return new DragAndDropPage();
    }

    public void navigateToPreferences() {
        click(preferenceLinkBy);
    }

    public PreferenceDependenciesPage navigateToPreferenceDependencies() {
        click(preferenceDependenciesLinkBy);

        return new PreferenceDependenciesPage();
    }

    public void scrollDown() {
        scroll(linksContainerBy, "down");
    }

    public void scrollUp() {
        scroll(linksContainerBy, "up");
    }

    public void isTextClockVisible(String textClockLinkText) {
        isElementVisible(textClockLinkText);
    }

    public void isAnimationVisible(String animationLinkText) {
        isElementVisible(animationLinkText);
    }
}
