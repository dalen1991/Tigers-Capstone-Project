@retailAll
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username and password
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @retailOne
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website     | taxID    | paymentMethod | payeeName    |
      | verynew | verynew.com | 12345678 | Cheque        | verynew User |
    And User check on About us check box
    And User click on continue button
    Then User should see a success message

  @retailTwo
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate information link
    And User click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | goodbank |    123321 |     45678 | gdebabki    |     123456789 |
    And User click on continue button
    Then User should see a success message

  @retailThree
  Scenario: Edit your account information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName  | email            | telephone |
      | Arcadii   | Horoshoev | 787855@gmail.com | 999997788 |
    And User click on continue button
    Then User should see a new message 'Success:Your account has been successfully updated.'
