Feature: Login to the website
  Scenario: Positive test validation login
    Given Initialized browser is a chromebrowser
    And The web site is "https://demo-1811.zaelab.com/b2b/powertools/en/USD/"
    And The user clicked on the [Sign in] button
    When User enters valid login "123" and valid password "1233"
    And Clicks on the 'Login' button
    Then Verify the user is successfully logged in

  Scenario: Positive test validation login1
    Given Initialized browser is a chromebrowser
    And The web site is "https://demo-1811.zaelab.com/b2b/powertools/en/USD/"
    And The user clicked on the [Sign in] button
    When User enters valid login "12355" and valid password "123553"
    And Clicks on the 'Login' button
    Then Verify the user is successfully logged in

