Feature: Get all collaborators
  Scenario: Get all collaborators
    Given Get all collaborators with valid id "2335599268"
    When Send request get all collaborators
    Then Status code should be 200
    And Response body name should be "Rizki Imaddudin" email should be "imaduddin.riski@gmail.com"
    And Validate json schema "get_all_collaborators_schema.json"