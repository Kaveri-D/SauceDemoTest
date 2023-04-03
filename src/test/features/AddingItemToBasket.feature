Feature: Verify user can add highest price item to cart
  As a user
  I want to search highest price item
  so I can add the item to cart
@Test
  Scenario: verify user can add item to cart
    Given I am On Homepage
    When  I login using correct credentials
    Then  I should login successfully
    And   I search for highest price item
    And   I add item to cart