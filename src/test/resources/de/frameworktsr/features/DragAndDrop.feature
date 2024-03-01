Feature: Drag And Drop

    The user should be able to drag and drop elements

    Scenario: Drag and drop textless circle
    `
    And the user naviagates to Drag and Drop page
    And the user drags and drops the textless circle
    Then the message "Dropped!" should be displayed
