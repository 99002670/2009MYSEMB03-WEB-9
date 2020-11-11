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
    
  Scenario: Register with invalid details
  	Given I open the chrome browser1
  	When I enter the URL1
  	Then The signup page should open1
  	When I do not enter name
  	And I click on Sign Up button1
    Then name mandataory error message should display
    When I do not enter email
  	And I click on Sign Up button1
    Then email mandatory error message should display
    When I enter invalid email
  	And I click on Sign Up button1
    Then email invalid message should display
    When I do not enter phone number
  	And I click on Sign Up button1
    Then number mandatory error message should display
    When I enter invalid phone number
  	And I click on Sign Up button1
    Then number invalid message should display
    When I do not enter password
  	And I click on Sign Up button1
    Then password mandataory error message should display
    When I enter an invalid password
    And I click on Sign Up button1
    Then password invalid message should display
    When I enter nonmatching password
    And I click on Sign Up button1
    Then nonmatching password message should display
   
