Feature: Delete Section

#  Positive Case
  @Tugas
  Scenario: Delete section with valid parameter id
    Given Delete section with id "7025"
    When Send request delete section
    Then Status code should be 204

#   Negative Case
  @Tugas
  Scenario: Delete section with special character
    Given Delete section with id "!@#$"
    When Send request delete section
    Then Status code should be 400
    And Validate response error body section_id is invalid

  @Tugas
  Scenario: Delete section with invalid id
    Given Delete section with id "9999999999999999)))))))))"
    When Send request delete section
    Then Status code should be 400
    And Validate response error body section_id is invalid