Feature: Get a project
  Scenario: Get a project with valid id
    Given Get a project with id "2335599268"
    When Send request get a project
    Then Status code should be 200
    And Response body name should be "Rizki Imaddudin" and id "2335599268"
    And Validate json schema "get_project_schema.json"

  Scenario: Get a project with invalid id
    Given Get a project with id "2335599268sdf"
    When Send request get a project
    Then Status code should be 400
    And Response body error should be Invalid Argument Value