package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class RatingBarPage extends BasePage {
    By threeStarRatingContainerBy = AppiumBy.id("io.appium.android.apis:id/ratingbar1");
    By ratingsInNumberscontainerBy = AppiumBy.id("io.appium.android.apis:id/rating");

    public void giveRating(Double rating) {
        int coordY = 0;
        int coordX = 0;

        if (rating <= 3.0) { // we use the upper bar when rating <= 3
            coordY = 422;
            if (rating == 0.5)
                coordX = 105;
            else if (rating == 1.0)
                coordX = 140;
            else if (rating == 1.5)
                coordX = 267;
            else if (rating == 2.0)
                coordX = 315;
            else if (rating == 2.5)
                coordX = 445;
            else if (rating == 3.0)
                coordX = 480;
        } else if (rating <= 5.0) { // we use lower bar when the 3 < rating <= 5
            coordY = 630;
            if (rating == 3.5)
                coordX = 612;
            else if (rating == 4.0)
                coordX = 647;
            else if (rating == 4.5)
                coordX = 778;
            else if (rating == 5.0)
                coordX = 814;
        }
        clickByCoordinates(coordX, coordY);
    }

    public Double getDisplayedRating() {
        String ratingsTextAndNumber = getTextAttribute(ratingsInNumberscontainerBy);
        Double rating = Double.parseDouble(ratingsTextAndNumber.substring(8, 11));

        return rating;
    }

    public Boolean isCorrectRatingDisplayed(Double providedRating) {
        Double displayedRating = getDisplayedRating();
        return Double.compare(displayedRating, providedRating) == 0;
    }
}
