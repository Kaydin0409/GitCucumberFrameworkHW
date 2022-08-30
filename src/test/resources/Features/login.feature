Feature: Login Functionality

  @login
  Scenario: Valid Admin Login
    Given user navigates to HRMS website
    When user enters valid admin username and password
    And user clicks on login button
    Then user is successfully logged in to HRMS