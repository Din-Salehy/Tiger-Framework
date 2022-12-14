Feature: Desktop Items

@desktopItems
Scenario: Validate Tablets tab on the UI
Given I am on Test Environment page
When I hover my mouse over desktop dropdown
Then I see show all deskptop link
Then I click on show all desktops link
And I validate the Tablets tab on the UI