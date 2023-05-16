Feature: Women Test
  As user I want to login into Luma website

  @sanity @regression
  Scenario: Verify the SortBy Product Name filter
    Given I am on homepage
    When  I Mouse Hover on Women Menu
    And   I Mouse Hover on Tops
    And   I Click on Jackets
    Then  I am directed on Jackets Page
    And   I  Select Sort By filter “Product Name”
    And   I Verify the products name displays in alphabetical order

    @smoke @regression
    Scenario: Verify the sortBy Price filter
      Given I am on homepage
      When  I Mouse Hover on Women Menu
      And   I Mouse Hover on Tops
      And   I Click on Jackets
      Then  I am directed on Jackets Page
      And   I  Select Sort By filter “Price”
      And   I Verify the products price display in Low to High
