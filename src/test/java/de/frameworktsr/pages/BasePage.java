package de.frameworktsr.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import de.frameworktsr.utils.DriverManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
    private AppiumDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        this.driver = new DriverManager().getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public WebElement getElement(By locatorBy) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locatorBy));

        return element;
    }

    public void click(By locatorBy) {
        getElement(locatorBy).click();
    }

    public void dragAndDropUsingElementId(By locatorBy, int endCoordinatesX, int endCoordinatesY) {
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", getElementId(locatorBy),
                "endX", endCoordinatesX,
                "endY", endCoordinatesY));
    }

    public void dragAndDropUsingCoordinates(int startX, int startY, int endX, int endY) {
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "startX", startX,
                "startY", startY,
                "endX", endX,
                "endY", endY));
    }

    public String getElementId(By locatorBy) {
        String elementId = ((RemoteWebElement) getElement(locatorBy)).getId();

        return elementId;
    }

    public void checkSimilarityOfText(String text1, String text2) {
        Assert.assertEquals(text1, text2);
    }

    public String getTextAttribute(By locatorBy) {
        String textAttributeValue = getElement(locatorBy).getText();

        return textAttributeValue;
    }

    public String getAttributeValue(By locatorBy, String attribute) {
        String attributeValue = getElement(locatorBy).getAttribute(attribute);

        return attributeValue;
    }

    public void addTextToField(By locatorBy, String textToAdd) {
        getElement(locatorBy).sendKeys(textToAdd);
    }

    public void scroll(By locator, String direction) {
        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
                ImmutableMap.of(
                    "elementId", getElementId(locator),
                        "direction", direction,
                        "percent", 3.0));
    }
}
