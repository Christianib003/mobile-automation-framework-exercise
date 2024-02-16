package de.frameworktsr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

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

    public Boolean isTextClockVisible(String elementText) {
        try {
            WebElement textClockLink = getElement(
                    AppiumBy.xpath("//android.widget.TextView[@text='" + elementText + "']"));
            return true;
        } catch (TimeoutException e) {
            throw e;
        }
    }
}
