Feature: feature to test Send functionality

  Scenario: Validate wallets Send working
    Given Iam On Bibatua Index Page
    And user login is successfully done.
    When clicking on wallets select PrakashETH Wallet
    And user click withdraw add adderess and amount and click on send
    Then user successfully send ammount to the respective address
