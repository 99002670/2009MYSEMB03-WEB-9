Feature: Registration page

  Scenario: Register with valid details
    Given I open the chrome browser
    When I enter the URL
    Then The signup page should open
    When I enter my full name
    Then My full name should display
    When I enter my email address
    Then My email address should display
    When I enter my phone number
    Then My phone number should display
    When I enter my password
    Then My password should display
    When I enter my password again
    Then My password should display again
    When I click on Sign Up button
    Then I should sign up
