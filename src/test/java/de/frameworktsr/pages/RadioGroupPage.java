package de.frameworktsr.pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class RadioGroupPage extends BasePage {
    By foodTypeRadioButtonsBy = AppiumBy.xpath("//android.widget.RadioGroup/android.widget.RadioButton");
    By clearAllSelectionsBtnBy = AppiumBy.accessibilityId("Clear");
    List<WebElement> foodTypesOptions;

    public void chooseFoodType(String foodType) {
        click(AppiumBy.accessibilityId(foodType));
    }

    public Boolean isFoodTypeSelected(String desiredFoodType) {

        // Get all radio buttons options
        foodTypesOptions = getAllElements(foodTypeRadioButtonsBy);

        // Loop through all the radio buttons
        for (WebElement foodTypeOption : foodTypesOptions) {
            String foodOptionName = foodTypeOption.getText();
            String isOptionChecked = foodTypeOption.getAttribute("checked");

            // check if the correct option has been selected
            if (foodOptionName.equals(desiredFoodType)) {

                // check if the desired radio button is checked
                if (isOptionChecked.equals("false")) {

                    // return false is the desired radio button is not checked
                    System.out.println("[FAILED] THE DESIRED FOOD TYPE WAS NOT SELECTED!");
                    return false;

                }
            // Check if there are no undesired options still selected
            } else {
                if (isOptionChecked.equals("true")) {
                    System.out.println("[FAILED] THE UNDESIRED OPTION \"" +  foodOptionName + "\" IS STILL SELECTED!");
                    return false;
                }
            }
        }
        return true;
    }

    public void checkIfCorrectFoodIsSelected(String expectedSelectedFoodType) {
            assertTrue(isFoodTypeSelected(expectedSelectedFoodType));
    }

    public void clearAllSelections() {
        click(clearAllSelectionsBtnBy);
    }

    public Boolean areAllOptionsCleared() {
        for (WebElement foodTypeOption : foodTypesOptions) {
            if(foodTypeOption.getAttribute("checked").equals("true")) {
                System.out.println("[FAILED] OPTION \"" + foodTypeOption.getText() + "\" IS STILL SELECTED!");
                return false;
            }
        }

        return true;
    }

    public void checkIfAllOptionsAreCleared() {
        assertTrue(areAllOptionsCleared());
    }
}
