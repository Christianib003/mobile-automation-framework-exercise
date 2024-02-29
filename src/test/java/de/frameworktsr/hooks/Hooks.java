package de.frameworktsr.hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;

import de.frameworktsr.utils.DriverManager;
import de.frameworktsr.utils.GlobalParams;
import de.frameworktsr.utils.ServerManager;
import de.frameworktsr.utils.VideoManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {

    @BeforeAll
    public static void startAppiumServer() {
        // Start the server
        new ServerManager().startServer();
    }

    @Before
    public void initialize() throws Exception {

        // Initialize GlobalParams (capabilities that are likely not to change)
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();


        // Initialize the driver
        new DriverManager().initializeDriver();

        // Start recording
        new VideoManager().startRecording();
    }

    @After
    public void quit(Scenario scenario) throws IOException {

        // Take screenshot if the scenario fails
        if (scenario.isFailed()) {
            byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);

            // Attach the screenshot to the scenario report
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        // Stop recording
        new VideoManager().stopRecording(scenario.getName());

        // Stop the driver
        DriverManager driverManager = new DriverManager();
        if (driverManager.getDriver() != null) {
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }

    }
    
    @AfterAll
    public static void closeAppiumServer() {
        // Stop the server
        ServerManager serverManager = new ServerManager();
        if (serverManager.getServer() != null) {
            serverManager.getServer().stop();
        }
    }
}
