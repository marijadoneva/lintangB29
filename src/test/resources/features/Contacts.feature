Feature: As a user, I should be able to create a new contact and edit/delete any contact under Contacts module


  User Story:
  As a user, I should be able to login with correct credentials.

  Background: For all scenarios user is on the login page of the seamlessly application

  Scenario Outline: User can create a new contact

    Given user is on the dashboard page
    When user navigates to Contact module
    And user clicks on new contact button
    And user fills "<name>"
    #Then new contact should appear in 'all contact' list


    Examples:
      | name            |
      | John Doe        |
      | Rob Stark       |
      | Jaime Lannister |
      | Jon Snow        |


  Scenario: User can User can see all the contacts as a list inside the middle column
  and total number of the contacts near the “All Contacts” tab

    Given user is on the dashboard page
    When user navigates to Contact module
    And user clicks on All contact button
    And user should see all contacts
    Then user should see the total number of contacts

  Scenario: User can change the profile picture of any contact with a previously
  uploaded picture by using “Choose from files” option
    Given user is on the dashboard page
    When user navigates to Contact module
    And user clicks on the first contact
    And user clicks on the picture icon
    And user clicks on From your file folder
    Then user clicks on wanted photo
    Then user clicks on Choose button

  Scenario: User can delete any selected contact
    Given user is on the dashboard page
    When user navigates to Contact module
    And user clicks on the first contact
    And user clicks on the three dots
    Then user clicks on delete button








