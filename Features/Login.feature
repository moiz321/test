Feature: Login
  Background:Common steps for all Scenarios
    Given User launch the Chrome Browser
    When user open URL "https://www.saucedemo.com/"

  Scenario: Successfull login with valid credentials
    And User enters Username as "standard_user"
    And User enters Password as "secret_sauce"
    And Click on login
    Then User should login successfully
    And Click on side menu
    When User clicks on log out link
    Then User should logout successfully
    #And Close the browser

  Scenario Outline: Successfull login with valid credentials with DTT
    And User enters Username as "<username>"
    And User enters Password as "<password>"
    And Click on login
    Then User should login successfully
    And Click on side menu
    When User clicks on log out link
    Then User should logout successfully
    #And Close the browser

    Examples:
      |username|password|
      |standard_user|secret_sauce|

    @Regression
    Scenario Outline: Successfull Order Placing journey
    And User enters Username as "<username>"
    And User enters Password as "<password>"
    And Click on login
    Then User should login successfully
    When User click on short add to cart
    Then Verify item should be add in the cart from short add to cart
    When User click on product from listning page
    Then Verify pdp should open successfully
    And User click on add to cart from PDP
    Then Verify add to cart successfully from PDP
    And User click on cart page
    Then Verify two items should be add in the cart
    When User remove one item from the item
    Then Verify one item should be in cart
    And User click on Checkout button
    Then Verify customer information page should be open
    And User fill the customer information
    When User click on Continue button
    Then Verify final checkout page should be open
    When User click on Finish button
    Then Verify order should be placed successfully

    Examples:
      |username|password|
      |standard_user|secret_sauce|