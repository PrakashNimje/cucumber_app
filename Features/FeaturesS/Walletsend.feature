Feature: feature to test Send functionality

  Scenario: Validate wallets Send working
    Given Iam On Bibatua Index Page
    And user login is successfully done.
    When user select PrakashETH Wallet and clicks withdraw and enter adderess and enter amount and click on send
    Then user successfully send ammount to the respective address
