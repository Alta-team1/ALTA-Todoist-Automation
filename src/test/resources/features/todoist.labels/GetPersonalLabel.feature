Feature: Get Personal Label
  Scenario: Get personal label with valid id
    Given Get personal label with id "2173899238"
    When Send request get personal label
    Then Status code should be 200

