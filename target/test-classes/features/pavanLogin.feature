@loginTestPavan
Feature: Login Test

Background: Successful login in with valid credentials 
Given user opens URL
And user enter email as 
And user enter password as 
Then user click on login

Scenario: Validation of succesfull login 
Given user should see page title
And user click on logout link

Scenario: Create customer account
Given user click on customers menu
#When user click on customers menu item
#And user click on add new button
#And user can view new customer page
#And user enter customer information
#Then user can view confirmation message "The new customer has been added succesfully"

