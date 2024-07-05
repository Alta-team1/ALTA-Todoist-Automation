Feature: Update Label
  Scenario: Update label with valid paramater and id
    Given Update user with valid parameter id and valid json "update_label.json"
    When Send request put update user
    Then Status code should be 200