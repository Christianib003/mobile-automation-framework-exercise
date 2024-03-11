package de.frameworktsr.stepdefinitions;

import static org.junit.Assert.assertTrue;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.RatingBarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ratings {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    RatingBarPage ratingBarPage;

    @When("the user navigates to ratings bar")
    public void the_user_navigates_to_ratings_bar() {
        apiDemosPage.scrollDownToRatingsBar();
        ratingBarPage = apiDemosPage.navigateToRatingBar();
    }

    @When("the user gives a {double} on three star line")
    public void the_user_gives_a_on_three_star_line(Double double1) {
        ratingBarPage.giveRating(double1);
    }

    @Then("the corresponding {double} should be reflected in numbers")
    public void the_corresponding_rating_should_be_reflected_in_numbers(Double double1) {
        assertTrue(ratingBarPage.isCorrectRatingDisplayed(double1));
    }
}
