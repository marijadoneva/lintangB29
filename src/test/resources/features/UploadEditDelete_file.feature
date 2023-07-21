Feature: User can upload a file

  User Story:
  As a user, I should be able to upload a file, move or delete any selected file under the Files module

  Background: For all scenarios user is on the login page of the seamlessly application
    Given user is on the dashboard page
  Scenario: As a user, I should be able to upload a file
    When User enters on "Files" module page
    And User click on the Upload file button
    And User can select file "C:/Users/chimi/OneDrive/Desktop/file.txt"
    Then User can see "file" uploading file on the list

    Scenario: As a user, I should be crate a new folder
      When user navigates on "Files" module page
      Then user clicks on add button
      And user creates new folder
      And user name the folder
      Then User creating New Folder, it can be see in the list


      Scenario: As a User, I can delete any selected item from its three dots menu
        When user navigates on "Files" module page
        Then user clicks on three dots of selected item
        And  clicks on delete folder or file
        Then User can deleting any selected item from its three dots menu

        Scenario:As a User, I can see the total number of files and folders under the files list table
          When user navigates on "Files" module page
          Then User can see the total number of the files and folders under the files list table

