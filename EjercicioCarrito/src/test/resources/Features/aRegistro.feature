Feature: As user of the site I Want to register my account So that I can buy a product

  Scenario Outline: User Registration
    Given That the user has the Registration Modal open
    When He enters a <usuario> and enters a <contrasenia>
    And He clicks the Sign Up button
    Then The box that shows us that the registration has been successful is displayed
    
    Examples:
    |usuario|contrasenia|
    |lucas.rosende12@yopmail.com|contrasenia10|