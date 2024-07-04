Feature: Create new labels

#  Positive Case
  Scenario: Create new labels with valid json
#    Harus buat label baru jangan pakai yang sudah dibuat
    Given Create new labels with file json "create_label.json"
    When Send request post create labels
    Then Status code should be 200
    And Validate response body label "Peternakan"
    And Validate json schema "create_personal_label_json_schema.json"

#    Negative Case
  Scenario: Create new labels with valid json
    Given Create new labels with file json "create_label_empty_name.json"
    When Send request post create labels
    Then Status code should be 400
    And Validate error message Label name is required for creation


  Scenario: Create new labels with valid json
    Given Create new labels with file json "create_label_empty_name.json"
    When Send request post create labels
    Then Status code should be 400
    And Validate error message Label name is required for creation


