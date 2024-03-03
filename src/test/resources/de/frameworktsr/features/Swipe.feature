Feature: Swipe actions

    As a user,
    I should be able to swipe my screen
    so that I can see overflowing content

    Background:
        When the user navigates to Views
    @current
    Scenario: Swipe left
        When the user navigates to Gallery
        And the user navigates to Photos
        And the user swipes the image in focus to the left
        Then the user should see all the images overflowing in the right
