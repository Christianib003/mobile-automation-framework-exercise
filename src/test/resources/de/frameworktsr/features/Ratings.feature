Feature: Ratings

    As a user
    I should be able to rate
    so that I can give feedback

    Background:
        When  the user navigates to Views
        And the user navigates to ratings bar

    @current
    Scenario: three-star max rating
        When the user gives a <rating> on three star line
        Then the corresponding <rating> should be reflected in numbers

        Examples:
            | rating |
            | 0.5    |
            | 1.0    |
            | 1.5    |
            | 2.0    |
            | 2.5    |
            | 3.0    |

    Scenario: five-star max rating
        When the user gives a "<rating>" on five star line
        Then the corresponding "<rating>" should be reflected in numbers
        Examples:
            | rating |
            # | 0.5    |
            # | 1.0    |
            # | 1.5    |
            # | 2.0    |
            # | 2.5    |
            # | 3.0    |
            # | 4.0    |
            | 4.5    |
            # | 5.0    |
