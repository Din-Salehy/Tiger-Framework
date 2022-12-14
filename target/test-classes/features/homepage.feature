
Feature: Homepage

@validateHPLinks

Scenario: Validate Homepage links

#Given I am on Test Environment Home page
Then I validate Desktops 'Desktops' on the UI
And I validate Laptops & Notebooks 'Laptops & Notebooks' on the UI
And I validate Tablets 'Tablets' on the UI
And I validate Software 'Software' on the UI
And I validate Phones & PDAs 'Phones & PDAs' on the UI
And I validate Cameras 'Cameras' on the UI
And I validate MP3 Players 'MP3 Players' on the UI


