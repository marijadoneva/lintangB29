Feature: As a user, I should be able to create a can modify tasks.

  User Story:
  As a user, I should be able to create a new task list or a single task and add any task to
  completed and important tasks list.

  Background: For all scenarios user is on the login page of the seamlessly application


  Scenario Outline: User can create a new list of tasks

    Given user is on the dashboard page
    When user navigates to Tasks module
    And user clicks on Add list button
    And user fills "<newList>" box
    And user clicks Checkmark button
    Then user should see "<expectedList>"


    Examples:
      | newList | expectedList |
      | School  | School       |
      | College | College      |
      | Work    | Work         |


  Scenario Outline: User can create new task
    Given user is on the dashboard page
    When user navigates to Tasks module
    And user clicks on "<newList>"
    And user clicks on Add task box
    And user writes "<task>"
    Then user clicks Enter
    Then user can see "<expectedTask>"

    Examples:
      | newList | task     | expectedTask |
      | School  | Homework | Homework     |
      | College | Material | Material     |