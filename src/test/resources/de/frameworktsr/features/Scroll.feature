Feature: Scroll feature

    The user should be able to scroll up and down

    Background:
        When the user navigates to Views
        And the user scrolls down

    Scenario: Scroll down
        Then the user should be able to see "TextClock" link

    @current
    Scenario: Scroll up
        When the user scrolls up to the top
        Then the user should be able to see "Animation" link at the top