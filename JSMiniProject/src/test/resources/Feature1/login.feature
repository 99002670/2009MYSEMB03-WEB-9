Feature: Login page

  Scenario: Login with valid details
    Given I open the chrome browser
    When I enter the URL
    Then The login page should open
    When I enter my email address
    Then My email address should display
    When I enter my password
    Then My password should display
    When I click on Log In button
    Then I should log in
