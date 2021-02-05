Feature: As user of the site I Want to login So that I can buy a product

  Scenario Outline: User Login
    Given That the user has the login Modal open
    When He enters his <usuario> and enters his <contrasenia>
    And He clicks the Log in button
    Then We are logged in the page
    
    Examples:
    |usuario|contrasenia|
    |lucas.rosende10@yopmail.com|contrasenia10|