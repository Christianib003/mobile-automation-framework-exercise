package de.frameworktsr.stepdefinitions;

import static org.junit.Assert.assertTrue;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.PhotosPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwipeLeftAndRight {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    PhotosPage photosPage;

    // Swipping to the left
    
    @When("the user navigates to Gallery")
    public void the_user_navigates_to_gallery() {
        apiDemosPage.navigateToGallery();
    }

    @When("the user navigates to Photos")
    public void the_user_navigates_to_photos() {
        photosPage = apiDemosPage.navigateToPhotos();
    }

    @When("the user swipes the image in focus to the left")
    public void the_user_swipes_the_image_in_focus_to_the_left() {
        photosPage.swipeImageLeft();
    }

    @Then("the user should see all the images overflowing in the right")
    public void the_user_should_see_all_the_images() {
        assertTrue(photosPage.areOtherImagesDisplayed());
    }

    // Swiping image to the right

    @When("the user swipes another image to the right")
    public void the_user_swipes_another_image_to_the_right() {
        photosPage.swipeImageRight();
    }

    @Then("user should see the first image")
    public void user_should_see_the_first_image() {
        assertTrue(photosPage.isFirstImageDisplayed());
    }
}