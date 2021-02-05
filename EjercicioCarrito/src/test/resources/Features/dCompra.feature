Feature: As user of the site I Want to add a product to the cart So that I can buy it

  Scenario: Adding the product to the cart
    Given That the user is logged in the page
    When He clicks on a product
    And He clicks the Add to cart button
    Then The product is added to the cart