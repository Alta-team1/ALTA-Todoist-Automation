Feature: Update a project
  Scenario: Update a project with valid data & id
    Given Update a project with id "2335599268" and json file "update_project.json"
    When Send request update a project
#    Then Status code should be 200
#    And Response body name should be "Kevin Martin"
#    And Validate json schema "update_project_schema.json"