package de.frameworktsr.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class PushPage extends BasePage {
    By dropdownOpenerBy = AppiumBy.id("io.appium.android.apis:id/spinner");
    By animationTypesOptionsBy = AppiumBy.xpath("//android.widget.CheckedTextView");
    By selectedAnimationTypeContainer = AppiumBy.id("android:id/text1");

    public void openDropdown() {
        click(dropdownOpenerBy);
    }

    public List<WebElement> getAllAnimationTypesOptions() {
        List<WebElement> animationTypesOptions = getAllElements(animationTypesOptionsBy);
        return animationTypesOptions;
    }

    public void selectAnimationType(String animationType) {
        for (WebElement option : getAllAnimationTypesOptions()) {
            if (option.getText().equals(animationType)) {
                click(AppiumBy.xpath("//android.widget.CheckedTextView[@text='" + animationType + "']"));
                break;
            }
        }
    }

    public Boolean isAnimationTypeSelected(String animationType) {
        String selectedAnimationType = getTextAttribute(selectedAnimationTypeContainer);
        return selectedAnimationType.equals(animationType);
    }
}
