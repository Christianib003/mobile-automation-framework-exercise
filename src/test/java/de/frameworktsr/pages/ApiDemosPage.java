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
    By customAdapterBy = AppiumBy.accessibilityId("1. Custom Adapter");
    By popupMenuLinkBy = AppiumBy.accessibilityId("Popup Menu");
    By ratingBarLinkBy = AppiumBy.accessibilityId("Rating Bar");
    By dateWidgetsLinkBy = AppiumBy.accessibilityId("Date Widgets");
    By dialogLinkBy = AppiumBy.accessibilityId("1. Dialog");
    By pushLinkBy = AppiumBy.accessibilityId("Push");

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
        swipeElement(pageLinksContainerBy, "up", 1.00);
    }

    public void swipeToTheTop() {
        swipeElement(pageLinksContainerBy, "down", 1.00);
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

    public ExpandableListsPage navigateToCustomerAdapter() {
        click(customAdapterBy);

        return new ExpandableListsPage();
    }

    public void scrollToPopUpMenuLink() {
        scrollUntilVisibilityOfElementWithText("Popup Menu");
    }

    public PopupMenuPage navigateToPopupMenu() {
        click(popupMenuLinkBy);

        return new PopupMenuPage();
    }

    public void scrollDownToRatingsBar() {
        scrollUntilVisibilityOfElementWithText("Rating Bar");
    }

    public RatingBarPage navigateToRatingBar() {
        click(ratingBarLinkBy);

        return new RatingBarPage();
    }

    public void navigateToDateWidgets() {
        click(dateWidgetsLinkBy);
    }

    public DialogPage navigateToDialog() {
        click(dialogLinkBy);

        return new DialogPage();
    }

    public void navigateToAnimation() {
        click(animationLinkBy);
    }

    public PushPage navigateToPush() {
        click(pushLinkBy);

        return new PushPage();
    }
}
