Feature: Get all section
  Scenario Outline: Get all section with valid parameter
    Given Get all section with parameter <id>
    When  Send request get all section
    Then Status code should be 200
    Examples:
    | id  |
    |2203306141|
