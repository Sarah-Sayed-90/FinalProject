Feature: select currencies

  @regression
  Scenario: select euro
    When Select Euro currency from the dropdown list on the top left of home page
    Then verify Euro Symbol (€) is shown on the 4 products displayed in Home page