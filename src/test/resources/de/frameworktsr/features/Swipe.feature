Feature: Swipe actions

    As a user,
    I should be able to swipe my screen
    so that I can see overflowing content

    Background:
        When the user navigates to Views

    Scenario: Swipe left
        When the user navigates to Gallery
        * the user navigates to Photos
        * the user swipes the image in focus to the left
        Then the user should see all the images overflowing in the right

    Scenario: Swipe right
        When the user navigates to Gallery
        * the user navigates to Photos
        * the user swipes the image in focus to the left
        * the user swipes another image to the right
        Then user should see the first image

    @current
    Scenario: Swipe up
        When the user swipes up
        Then the user should see all the elements at the bottom of the page

