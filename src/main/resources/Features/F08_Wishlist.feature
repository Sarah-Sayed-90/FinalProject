Feature: Wishlist Feature

  Background: A user Navigates to homepage page
    Given  A user Navigates to homepage URL
  @regression
  Scenario: As a user, I can add to wishlist successfully
    When A user click to add to wishlist
    Then A Success Message is Displayed and it is green
  @regression
  Scenario: As a user, I can open the wishlist cart after the green message dis appeared
    When A green message is dis appeared to click on wishlist card
    Then A Qty value is bigger than zero