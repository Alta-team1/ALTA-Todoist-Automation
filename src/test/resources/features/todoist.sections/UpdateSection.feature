Feature: Update section

#  Positive Case
  @Tugas
  Scenario:  Update section with valid parameter id and valid json
    Given Update section with valid parameter id "159910730" and valid json "update_section.json"
    When Send request post update section
    Then Status code should be 200
    And Validate response body name should be "Ini Warteg Edit"
    And Validate json schema "update_section_json_schema.json"

#  Negative Case
  @Tugas
  Scenario:  Update section with invalid parameter id and valid json
    Given Update section with valid parameter id "!@#$" and valid json "update_section.json"
    When Send request post update section
    Then Status code should be 400
    And Validate response body error section_id is invalid

  @Tugas
  Scenario:  Update section with valid parameter id and invalid json
    Given Update section with valid parameter id "9999999999999999" and valid json "update_section.json"
    When Send request post update section
    Then Status code should be 404
    And Validate response error body Section not found

  @Tugas
  Scenario:  Update section with valid parameter id and invalid json
    Given Update section with valid parameter id "159910730" and valid json "update_section_error.json"
    When Send request post update section
    Then Status code should be 400
    And Validate response body error Empty name

