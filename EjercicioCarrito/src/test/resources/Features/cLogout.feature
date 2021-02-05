Feature: As user of the site I Want to log out of the site So that I log in again later

  Scenario: Logging out of the page
    Given That the user is logged in
    When He clicks on the logout button
    Then The user is logged out of the page