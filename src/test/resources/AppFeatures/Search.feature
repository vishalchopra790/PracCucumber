
Feature: Amazon Search
  Background:
  Given I  have  a search field on search page

  @Regression
  Scenario: Search a Product
    When  I search for a product with a name "Apple Iphone 11" and price 10000
    Then  Product with name "Apple Iphone 11" should be displayed
    And figure out something

  @Prod
  Scenario: Search a Product
    When  I search for a product with a name "MacBook Air" and price 10000
    Then  Product with name "MacBook Air" should be displayed

  @QA
  Scenario: Search a Product
    When  I search for a product with a name "Apple Iphone 12" and price 10000
    Then  Product with name "Apple Iphone 12" should be displayed