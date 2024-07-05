Feature: Get all personal labels

#  Positive Case
  Scenario: Get all personal labels with valid url
    Given Get all personal labels with parameter
    When Send request get all personal labels
    Then Status code should be 200
    And Validate response body id "2173845915"
    And Validate json schema "get_all_labels_json_schema.json"

#Negative Case
  Scenario: Get all personal labels with invalid parameter
    Given Get all personal labels with parameter
    When Send request get all personal labels error
    Then Status code should be 404
    And Validate response error body "Not found"

  Scenario: Get all personal labels with invalid parameter
    Given Get all personal labels with parameter
    When Send request get all personal labels error with special character
    Then Status code should be 404
    And Validate response error body "Not found"

