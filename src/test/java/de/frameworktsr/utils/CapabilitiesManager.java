package de.frameworktsr.utils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesManager {
    public DesiredCapabilities getCapabilities() throws IOException {
        // Create a new instance of GlobalParams to use them
        GlobalParams params = new GlobalParams();

        // Create a new instance of PropertyManager to use them as capabilities
        Properties props = new PropertyManager().getProperties();

        try {
            // Initialize capabilities object
            DesiredCapabilities capabilities = new DesiredCapabilities();

            // Set capabilities using params and props
            capabilities.setCapability("platformName", params.getPlatformName());
            capabilities.setCapability("deviceName", params.getDeviceName());
            capabilities.setCapability("systemPort", Integer.parseInt(params.getSystemPort()));
            capabilities.setCapability("automationName", props.getProperty("androidAutomationName"));
            capabilities.setCapability("appPackage", props.getProperty("androidAppPackage"));
            capabilities.setCapability("appActivity", props.getProperty("androidAppActivity"));
            String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                    + File.separator + "resources" + File.separator + "de" + File.separator + "frameworktsr"
                    + File.separator + "app" + File.separator + "ApiDemos-debug.apk";

            capabilities.setCapability("app", androidAppUrl);

            return capabilities;

        } catch (Exception e) {

            // Catch and print exception if the capabilities are not initialized
            // successfully
            e.printStackTrace();
            throw e;
        }
    }
}
