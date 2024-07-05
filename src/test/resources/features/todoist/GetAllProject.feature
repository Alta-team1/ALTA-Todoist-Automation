Feature: Get All Project
  Scenario: Get all project with valid parameter
    Given Get all project with valid parameter & token
    When Send request get all project
    Then Status code should be 200
    And Response body id should be "2335537549"
    And Validate json schema "all_project_schema.json"

  Scenario: Get all project with invalid parameter
    Given Get all project with invalid parameter
    When Send request get all project invalid
    Then Status code should be 404
    And Response body error should be "Not found"
    And Validate json schema "all_project_invalid_schema.json"

  Scenario: Get all project with invalid token
    Given Get all project with invalid token
    When Send request get all project
    Then Status code should be 401
    And Response body error should be Forbidden
