Feature: Ratings

    As a user
    I should be able to give a rating
    so that I can give feedback

    @current
    Scenario: three-star max rating
        When  the user navigates to Views
        And the user navigates to ratings bar
        When the user gives a <rating> using stars
        Then the corresponding <rating> should be reflected in numbers

        Examples:
            | rating |
            | 0.5    |
            | 1.0    |
            | 1.5    |
            | 2.0    |
            | 3.0    |
            | 3.5    |
            | 4.0    |
            | 4.5    |
            | 5.0    |
