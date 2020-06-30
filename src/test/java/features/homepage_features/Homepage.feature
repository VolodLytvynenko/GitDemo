Feature: Homepage functionality
  Scenario: Check that categories  are displayed on the homepage
    Given Initialized browser is a chrome
    When Homepage is opened "https://electronics.demo-1905.zaelab.com/b2c/electronics/en/"
    Then POWER DRILLS, ANGLE GRINDERS, SCREWDRIWERS, SANDERS Categories are displayed
    And Products in the WHAT'S NEW section
    And Products in the OUR BESTSELLING PRODUCTS section
    And Total count of products on the home page = 14

  Scenario: Check that footer is  displayed on the homepage
    Given Initialized browser is a chrome
    When Homepage is opened "https://electronics.demo-1905.zaelab.com/b2c/electronics/en/"
    Then The footer is displayed
    And The 8 links are displayed in the footer



