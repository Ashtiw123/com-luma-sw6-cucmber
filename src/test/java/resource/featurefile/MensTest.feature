@smoke @regression
Feature: Testing functionality in the Mens section on the site.

  Scenario: Verify if I can add a product to the shopping cart successfully
    Given I hover on the Men menu option
    When I hover on the Bottoms option
    And I click the Pants option
    And I hover on the 'Cronus Yoga Pant' and click on size "32".
    And I hover on the 'Cronus Yoga Pant' and click on the colour "Black".
    And I hover on the 'Cronus Yoga Pant' and click on the ‘Add To Cart’ Button.
    Then I should see the text "You added Cronus Yoga Pant to your shopping cart."
    And I should see the title "Shopping Cart."
    And I should see the product name "Cronus Yoga Pant"
    And I should see the size as "32"
    And I should see the colour as "Black"
