Feature: Gear Test
  As user I want to login into Luma website and want to add item to shopping cart from gear page

  @sanity @regression
  Scenario: User should add product successfully to shopping cart
    Given I am on Bags Page under gear tab from Homepage
    When  I Click on Product Name ‘Overnight Duffle’
    And   I Verify the text ‘Overnight Duffle’
    And   I Change Qty 3
    And   I Click on ‘Add to Cart’ Button.
    And   I Verify the text ‘You added Overnight Duffle to your shopping cart.’
    And   I Click on ‘shopping cart’ Link into message
    Then  Product is added to shopping cart successfully
    And   Verify the product name ‘Overnight Duffle’
    And   Verify the Qty is ‘3’
    And   Verify the product price ‘$135.00’
    And   I Change Qty to ‘5’
    And   I Click on ‘Update Shopping Cart’ button
    And   I Verify the product price ‘$225.00’

