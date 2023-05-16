
@sanity @regression
Feature: Testing functionality in the Womens section on the site.

  Background: Going to the Jackets page
    Given I hover on the Women menu option
    And I hover on the Tops option
    And I click the Jackets option

  Scenario: Verify if I can sort the products by name using the filter
    When I select the filter to sort by "Product Name"
    Then I should see the products name display in alphabetical order

  Scenario: Verify if I can sort the products by price using the filter
    When I select the filter to sort by "Price"
    Then I should see the products price display in ascending order