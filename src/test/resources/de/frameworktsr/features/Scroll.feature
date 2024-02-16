Feature: Scroll feature

    Background:
        When the user navigates to Views
        And the user scrolls down

    @current
    Scenario: Scroll down
        Then the user should be able to see "TextClock" link

    Scenario: Scroll up
        When the user scrolls up to the top
        Then the user should be able to see "Animaiton" link