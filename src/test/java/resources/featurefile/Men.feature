Feature: Men Test
  As user I want to login into Luma website and wants to add product to cart

  @sanity @regression
  Scenario: User should add product successfully to shopping cart
    Given I am on Pants Page under Mens tab from Homepage
    When  I Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size"32".
    And   I Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour "Black".
    And   I Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
    And   I Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    And   I Click on ‘shopping cart’ Link into message
    Then  Product is added to shopping cart successfully
    And   I Verify the text ‘Shopping Cart.’
    And   I Verify the product name ‘Cronus Yoga Pant’
    And   I Verify the product size ‘32’
    And   I Verify the product colour ‘Black’