Feature: Update a project

  @Tugas
  Scenario: Update a project with valid data & id
    Given Update a project with json file "update_project.json" and id "2335599268"
    When Send request update a project
    Then Status code should be 200
#    And Response body name should be "Kevin Martin"
#    And Validate json schema "update_project_schema.json"

#  Scenario: Update a project with invalid id
#  Given Update a project with file json "update_project_invalid.json" and id "2335599268sdf"
#    When Send request update a project
#    Then Status code should be 400
#    And Response body error should be Invalid Argument Value

#  Scenario: Update a project with invalid data
#  Given Update a project with file json "update_project_invalid.json" and id "2335599268"
#    When Send request update a project
#    Then Status code should be 400
#    And Response body erorr should be "Bad Request"
#    And Validate json schema "update_project_schema.json"