Feature: User can upload a file

  User Story:
  As a user, I should be able to upload a file, move or delete any selected file under the Files module

  Background: For all scenarios user is on the login page of the seamlessly application

  Scenario: As a user, I should be able to upload a file
    Given user is on the dashboard page
    When User enters the Files page
    And User click on the Upload file button
    And User can select file to upload
    Then User can see uploading file on the list

