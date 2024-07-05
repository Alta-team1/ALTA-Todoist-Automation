Feature: Get all collaborators

  @Tugas
  Scenario: Get all collaborators with valid id
    Given Get all collaborators with valid id "2335599268"
    When Send request get all collaborators
    Then Status code should be 200
    And Response body name should be "Rizki Imaddudin" email should be "imaduddin.riski@gmail.com"
    And Validate json schema "get_all_collaborators_schema.json"
  @Tugas
  Scenario: Get all collaborators with invalid id
    Given Get all collaborators with valid id "2335599268sdf"
    When Send request get all collaborators
    Then Status code should be 400
    And Response body error should be Invalid Argument Value

  Scenario: Get all collaborators with invalid parameter
    Given Get all collaborators with valid id "2335599268" and invalid parameter
    When Send request get all collaborators invalid parameter
    Then Status code should be 404
    And Response body error should be "Not found"
    And Validate json schema "get_all_collaborators_invalid_schema.json"
