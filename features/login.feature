Feature: validating log in credential
  Scenario: log in with valid id and password
    Given user open parabank website
    And user input id and password
    When click submit button
    And user able to click transfer button
    And put ammount and submit
    Then user validate the page title
   


