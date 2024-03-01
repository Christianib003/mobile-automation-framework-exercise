Feature: Choose Food

    The user should be able to select one type of Food

    Scenario: Choosing a food type
    When the user navigates to Views
    And the user navigates to Radio Group
    And the user chooses the type of food as "<food_type>"
    Then the "<food_type>" should be selected
    And the user should be able to clear their selection

    Examples:
        | food_type |
        | Dinner |
        # | Snack |
        # | All of them |
