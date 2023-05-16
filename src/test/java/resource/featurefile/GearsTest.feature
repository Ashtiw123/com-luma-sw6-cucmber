@regression
Feature: Testing functionality in the Gear section on the site.

  Scenario: Verify if I can add a product to the shopping cart successfully
    Given I hover on the Gear menu option
    When I click the Bags option
    And I click the product named 'Overnight Duffle'
    Then I should see the text of bag "Overnight Duffle"
    And I change the quantity to 3
    And I click on the 'Add to Cart' button duffle bag
    Then I should see the text "You added Overnight Duffle to your shopping cart."
    And I click on the 'shopping cart' link in the message
    Then I should see the product name "Duffle Bag"
    And The quantity should be "3"
    And The product price should be "$135.00"
    And I change the quantity to "5"
    And I click on the 'Update Shopping Cart' button
    Then the product price should be "$225.00"