@retailPageTest
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click  on My Account
    When User click on Login
    And User enter username 'userName' and password 'password'
    And User click on Login button
    Then User should be logged in to My Account dashboard

  @registerTest
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company      | website          | taxID    | paymentMethod |
      | Tiger224 ltd | www.tiger224.com | tiger224 | cheque        |
    And User enter cheque payee name
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @editTest1
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate information link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | RBC224   | RBC224    | RBC224    | Tiger224    | T22345224     |
    And User click on Continue button
    Then User should see a success message

  @edittest2
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname    | lastName | email               | telephone   |
      | Tekschool224 | Tiger224 | tiger.224@gmail.com | 437-3583224 |
    And User click on continue button
    Then User should see a message 'Success: Your account has been successfully updated.'