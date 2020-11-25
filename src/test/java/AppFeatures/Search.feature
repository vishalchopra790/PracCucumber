Feature: Amazon Search

Scenario: Search a Product
  Given I  have  a search field on search page
  When  I search for a product with a name "Apple Iphone 11" and price 10000
  Then  Product with name "Apple Iphone 11" should be displayed
