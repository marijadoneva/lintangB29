Feature: User should login

  User Story:
  As a user, I should be able to login with correct credentials.

  Background: For all scenarios user is on the login page of the seamlessly application
    Given user is on the login page of the seamlessly application


  Scenario: Login with valid credentials
    When user enters "Employee80" username
    And user enters "Employee123" password
    And user clicks Log in
    Then user should see the dashboard