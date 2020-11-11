Feature: Login page

  Scenario: Login with valid details
    Given I open the chrome browser2
    When I enter the URL2
    Then The login page should open
    When I enter my email address2
    Then My email address should display2
    When I enter my password2
    Then My password should display2
    When I click on Log In button
    Then I should log in
    
   Scenario: Login with invalid details
		Given I open the chrome browser3
    When I enter the URL3
    Then The login page should open3
    When I do not enter email3
    And I click on Log In button3
    Then email mandatory error message should dislpay3
    When I enter invalid email3
  	And I click on Log In button3
    Then email invalid message should display3
    When I do not enter password3
    And I click on Log In button3
    Then password mandataory error message should display3
    When I enter nonregistered email and password
    And I click on Log In button3
    Then invalid credentials error message should display