Feature: Pop Up

    The user should be able to interact with popups

    Scenario: Adding New WIFI Setting
        When the user navigates to Prefence
        And the user naviagtes to Preference dependencies
        * the user activates the WIFI settings
        * the user taps on WIFI settings
        * the user enters and saves "RK" as a WIFI setting
        Then WIFI setting "RK" should be saved