Feature: Customers

  Background: Below are the common Steps
    Given User Launch chrome Browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then User can view Dashboard

@sanity 
Scenario: Add new Customer
    And Click on Customer Menu
    And Click on Customer Menu Item
    And Click on add new button
    Then User can view Add new customer Page
    When User enter customer info
    And Click on Save button
    Then User can view confirmation Message "The new Customer has been added sucessfully."
    And close browser

@regression
Scenario: Search Customer by EmailId
    And Click on Customer Menu
    And Click on Customer Menu Item
    And Enter customer email
    When click search button
    Then User should found Email in the search table
    And close browser

@regression
Scenario: Search Customer by Name
    And Click on Customer Menu
    And Click on Customer Menu Item
    And Enter customer FirstName
    And Enter customer LastName
    When click search button
    Then User should found Name in the search table
    And close browser
