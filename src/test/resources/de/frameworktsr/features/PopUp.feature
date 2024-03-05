Feature: Pop Up

    The user should be able to interact with popups
    
    Scenario: Open pop up
    When the user navigates to Views
    And the user navigates to Popup Menu
    And the user clicks on "Make a Popup!" button
    Then a popup with text "Search" should be displayed
