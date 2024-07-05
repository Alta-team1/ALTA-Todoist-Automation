Feature: Delete a project

  @Tugas
  Scenario: Delete a project with valid id
    Given Delete a project with valid id "2335601234"
    When Send request delete a project
    Then Status code should be 204
  @Tugas
  Scenario: Delete a project with invalid id
    Given Delete a project with invalid id "kdsjf"
    When Send request delete a project
    Then Status code should be 400
    And Response body error should be Invalid Argument Value
