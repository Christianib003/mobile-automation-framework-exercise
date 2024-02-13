package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ApiDemosPage extends BasePage {
    By viewsLinkBy = AppiumBy.accessibilityId("Views");
    By dragAndDropLinkBy = AppiumBy.accessibilityId("Drag and Drop");
    

    public void navigateToviews() {
        click(viewsLinkBy);
    }

    public DragAndDropPage navigateToDragAndDropPage() {
        click(dragAndDropLinkBy);

        return new DragAndDropPage();
    }

   
}
