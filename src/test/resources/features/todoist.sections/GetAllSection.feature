Feature: Get all section

#  Postive Case
  @Tugas
  Scenario: Get all section with valid parameter
    Given Get all section with parameter
    When  Send request get all section
    Then Status code should be 200
    And Validate response body "159627774"
    And Validate json schema "get_all_section_json_schema.json"

#    Negative Case
  @Tugas
  Scenario: Get all section with invalid parameter
    Given Get all section with parameter
    When  Send request get all section error
    Then Status code should be 404
    And Validate response error body "Not found"

