Feature: Get single Section

#  Positive Case
  @Tugas
  Scenario: Get single section with valid parameter
    Given Get single section with parameter "159832996"
    When Send request get single user
    Then Status code should be 200
    And Validate response single response body "159832996"
    And Validate json schema "get_single_json_schema.json"

#  Negative Case
  @Tugas
  Scenario: Get single section with valid parameter
    Given Get single section with parameter "!@#$"
    When Send request get single user
    Then Status code should be 400
    And Validate response error body Invalid argument value

  @Tugas
  Scenario: Get single section with valid parameter
    Given Get single section with parameter "999999999"
    When Send request get single user
    Then Status code should be 404
    And Validate response error body Section not found

  @Tugas
  Scenario: Get single section with valid parameter
    Given Get single section with parameter "00000000000"
    When Send request get single user
    Then Status code should be 400
    And Validate response error body Invalid argument value
