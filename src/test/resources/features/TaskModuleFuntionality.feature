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
      | newList | task       | expectedTask |
      | School  | Assignment | Assignment   |
      | School  | Homework   | Homework     |
      | College | Material   | Material     |
      | College | Daily      | Daily        |
      | Work    | Project    | Project      |
      | Work    | Monthly    | Monthly      |


  Scenario Outline: User can click on wanted task
    Given user is on the dashboard page
    When user navigates to Tasks module
    And user clicks on "<newList>"
    And user clicks on check box
    Then user should see "Completed" in tasks list
    Then user should see the number of "completed" tasks
    Then user should reset changes


    Examples:
      | newList |
      | School  |


  Scenario Outline: User can click on wanted task
    Given user is on the dashboard page
    When user navigates to Tasks module
    And user clicks on "<newList>"
    And user clicks on star
    Then user should see "Important" in tasks list
    Then user should see the number of "starred" tasks
    Then user should reset



    Examples:
      | newList |
      | College |

  Scenario Outline: User can click on Current tasks
    Given user is on the dashboard page
    When user navigates to Tasks module
    And user clicks on "<newList>"
    Then user should see the number of "current" tasks
    Examples:
      | newList |
      | Current |


  Scenario Outline: user resets the page
    Given user is on the dashboard page
    When user navigates to Tasks module
    And user clicks on "<newList>"
    And user clicks on three dots
    And user clicks on delete
    Examples:
      | newList |
      | School  |
      | College |
      | Work    |







