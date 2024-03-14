Feature: Dropdown

    As a user
    I should be able to select from the Dropdown
    so that I can see the animation I want

    @current
    Scenario: Select animation
        When the user navigates to Views
        And the user navigates to animation
        And the user navigates to Push
        And the user selects their preferred "<animation_type>"
        Then the correct "<animation_type>" should be selected

        Examples:
            | animation_type |
            | Cross fade     |
            | Push up        |
            | Hyperspace     |
            | Push left      |