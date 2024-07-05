Feature: Get a project

  @Tugas
  Scenario: Get a project with valid id
    Given Get a project with id "2335537756"
    When Send request get a project
    Then Status code should be 200
    And Response body name should be "Inbox" and id "2335537756"
    And Validate json schema "get_project_schema.json"
  @Tugas
  Scenario: Get a project with invalid id
    Given Get a project with id "2335599268sdf"
    When Send request get a project
    Then Status code should be 400
    And Response body error should be Invalid Argument Value