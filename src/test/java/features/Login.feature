Feature: Login to the website
  Scenario: Positive test validation login
    Given Initialized browser is a chrome
    And The web site is "https://electronics.demo-1905.zaelab.com/b2c/electronics/en/"
    And The user clicked on the [Sign in] button
    When User enters valid login "123" and valid password "1233"
    And Clicks on the 'Login' button
    Then Verify the user is successfully logged in



