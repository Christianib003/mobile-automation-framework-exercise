package de.frameworktsr.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.codec.binary.Base64;

import io.appium.java_client.screenrecording.CanRecordScreen;

public class VideoManager {

    // Create a method to start recording
    public void startRecording() {
        ((CanRecordScreen) new DriverManager().getDriver()).startRecordingScreen();
    }

    // Create a method to stop recording
    public void stopRecording(String scenarioName) throws IOException {
        GlobalParams params = new GlobalParams();
        String media = ((CanRecordScreen) new DriverManager().getDriver()).stopRecordingScreen();

        // Specify the directory you want to save your recordings in
        String dirPath = "target/reports/videos" + File.separator + params.getDeviceName();

        File videoDir = new File(dirPath);

        synchronized (videoDir) {

            // Create the directory to save recordings if it doesn't exit
            if (!videoDir.exists()) {
                videoDir.mkdirs();
            }
        }
        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(videoDir + File.separator + scenarioName + ".mp4");

            // Convert the video to readable format
            stream.write(Base64.decodeBase64(media));
            stream.close();
        } catch (Exception e) {

            // catch error if the video is not recorded and saved successfully
            e.printStackTrace();
        } finally {
            if (stream != null) {
                stream.close(); // close the stream
            }
        }
    }
}
