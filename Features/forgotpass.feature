Feature: Test Forgot Password functionality

  Scenario: Check forgot Functionality
    Given chrome is open
    And user is on index page click on signIN Page
    When user click forgot pass link
    And user Enter Email Address click otp
    Then successfully sent otp
