@current
Feature: Long Click Action

    As a user,
    I should be able to tap and hold on a item
    so that I access more options about the item

    Scenario: Long click
        When  the user navigates to Views
        And the user navigates to expandable lists
        And the user navigates to Custom Adapter
        And the user long clicks on People Names
        Then sample menu popup should be displayed