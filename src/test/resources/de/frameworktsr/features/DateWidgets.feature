Feature: Update Date and Time

    As a user
    I should be able to update date and Time
    so that I can keep my application up to date

    Background:
        When the user navigates to Views
        And the user navigates to Date Widgets
        And the user navigates to Dialog

    Scenario: Change the date
        When the user changes the date
        Then the updated date should be reflected at the top

    @current
    Scenario: Change the time (clock)
        When the user changes the time
        Then the updated time should be reflected at the top