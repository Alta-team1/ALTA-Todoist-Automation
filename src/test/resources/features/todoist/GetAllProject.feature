Feature: Get All Project
  Scenario: Get all project with valid parameter
    Given Get all project with valid parameter & token
    When Send request get all project
    Then Status code should be 200
    And Response body id should be "2335537756"
    And Validate json schema "all_project_schema.json"
