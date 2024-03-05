package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ApiDemosPage extends BasePage {
    By viewsLinkBy = AppiumBy.accessibilityId("Views");
    By dragAndDropLinkBy = AppiumBy.accessibilityId("Drag and Drop");
    By preferenceLinkBy = AppiumBy.accessibilityId("Preference");
    By preferenceDependenciesLinkBy = AppiumBy.accessibilityId("3. Preference dependencies");
    By linksContainerBy = AppiumBy.id("android:id/content");
    By radioGroupLinkBy = AppiumBy.accessibilityId("Radio Group");
    By galleryLinkBy = AppiumBy.accessibilityId("Gallery");
    By photosLinkBy = AppiumBy.accessibilityId("1. Photos");
    By pageLinksContainerBy = AppiumBy.xpath("//android.widget.ListView");
    By webView3LinkBy = AppiumBy.accessibilityId("WebView3");
    By animationLinkBy = AppiumBy.accessibilityId("Animation");
    By expandableListsLinkBy = AppiumBy.accessibilityId("Expandable Lists");

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

    public RadioGroupPage navigateToRadioGroup() {
        scrollUntilVisibilityOfElementWithText("Radio Group");
        click(radioGroupLinkBy);

        return new RadioGroupPage();
    }

    public void navigateToGallery() {
        click(galleryLinkBy);
    }

    public PhotosPage navigateToPhotos() {
        click(photosLinkBy);

        return new PhotosPage();
    }

    public void swipeToTheBottom() {
        swipe(pageLinksContainerBy, "up", 1.00);
    }

    public void swipeToTheTop() {
        swipe(pageLinksContainerBy, "down", 1.00);
    }

    public Boolean areBottomContentsDisplayed() {
        getElement(webView3LinkBy);

        return true;
    }

    public Boolean areTopElementsDisplayed() {
        getElement(animationLinkBy);

        return true;
    }

    public void navigateToExpandableLists() {
        click(expandableListsLinkBy);
    }
}
