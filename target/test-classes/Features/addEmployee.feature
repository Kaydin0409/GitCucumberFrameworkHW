Feature: Add Employee Functionality

  @addEmployee
  Scenario: Adding employee to HRMS Website
    Given user is successfully logged into HRMS Website
    When user clicks on PIM and selects Add Employee
    Then user enters employee first and last name
    And clicks the save button
    Then employee is added successfully