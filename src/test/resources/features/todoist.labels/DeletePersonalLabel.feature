Feature: Delete personal label
  Scenario: Delete personal label with valid id
    Given Delete personal label with id "2173899194"
    When Send request delete personal label
    Then Status code should be 204