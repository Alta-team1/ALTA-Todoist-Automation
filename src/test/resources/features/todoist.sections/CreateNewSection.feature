Feature: Create new section

#  Positive Case
  @Tugas
  Scenario: Create a section with valid request
    Given Post create a new section with file json "create_section.json"
    When Send request post create section
    Then Status code should be 200
    And Validate response body name should be "Malfa"
    And Validate json schema "create_section_json_schema.json"

#  Negative Case
  @Tugas
  Scenario: Create a section with empty name
    Given Post create a new section with file json "create_section_empty_name.json"
    When Send request post create section
    Then Status code should be 400
    And Validate response error body Name is required

  @Tugas
  Scenario: Create a section with valid request
    Given Post create a new section with file json "create_section_empty_id_project.json"
    When Send request post create section
    Then Status code should be 400
    And Validate response error body project_id is invalid

  @Tugas
  Scenario: Create a section with empty name key
    Given Post create a new section with file json "create_section_empty_name_key.json"
    When Send request post create section
    Then Status code should be 400
    And Validate response error body "Required argument is missing"

  @Tugas
  Scenario: Create a section with empty name key
    Given Post create a new section with file json "create_section_empty_id_project_key.json"
    When Send request post create section
    Then Status code should be 400
    And Validate response error body "Required argument is missing"

  @Tugas
  Scenario: Create a section with empty name key
    Given Post create a new section with file json "create_section_empty_name_id_project_key.json"
    When Send request post create section
    Then Status code should be 400
    And Validate response error body "Required argument is missing"




