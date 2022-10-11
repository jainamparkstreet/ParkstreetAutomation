Feature: Login Feature

  Scenario Outline: Login to the cockpit in parkstreet
    Given user navigate to the cockpit website
    When user validates the Home page title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on the Login button.

    Examples: 
      | username | password |
      | valid    | valid    |
      | Invalid  | valid    |
      | valid    | Invalid  |
      | Invalid  | Invalid  |
