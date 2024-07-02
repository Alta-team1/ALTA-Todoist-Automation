Feature: Delete a project
  Scenario: Delete a project with valid id
    Given Delete a project with valid id "2335601234"
    When Send request delete a project
    Then Status code should be 204