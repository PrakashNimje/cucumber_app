Feature: feature to test SignUP functionality

  Scenario: Validate SignUP Page working
    Given browser window is open
    And user is on Bitbatua SignUP page
    When user enters a FullName EmailAddress Passs
    And user click on checkbox signUp
    Then user successfully create signUp
