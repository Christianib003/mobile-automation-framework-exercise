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

    public void click(By locatorBy) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locatorBy));
        element.click();
    }

    public void dragAndDrop(By locatorBy, int endCoordinatesX, int endCoordinatesY) {
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", getElementId(locatorBy),
                "endX", endCoordinatesX,
                "endY", endCoordinatesY));
    }

    public String getElementId(By locatorBy) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locatorBy));
        String elementId = ((RemoteWebElement) element).getId();

        return elementId;
    }

    public void checkSimilarityOfText(String text1, String text2) {
        Assert.assertEquals(text1, text2);
    }

    public String getTextAttribute(By locatorBy) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locatorBy));
        String textAttributeValue = element.getText();

        return textAttributeValue;
    }
}
