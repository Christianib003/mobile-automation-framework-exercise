package de.frameworktsr.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
}
