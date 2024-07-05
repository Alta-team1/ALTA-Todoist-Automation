@Projects
Feature: Create a new project
  Scenario: Create a new project with valid data
    Given Create new project with file json "create_project.json"
    When Send request create new project
    Then Status code should be 200
    And Response body name should be "Rizki Imaddudin"
    And Validate json schema "create_project_schema.json"
  
  Scenario: Create a new project with invalid data
    Given Create new project with file json "create_project_invalid.json"
    When Send request create new project
    Then Status code should be 400
    And Response body error should be "Bad Request"
    And Validate json schema "create_project_invalid_schema.json"

