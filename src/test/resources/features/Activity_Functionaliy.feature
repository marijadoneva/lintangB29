Feature: Activity Functionality

  User Story: As a user, I should be able to see listed items under the Activity module.

  Background: For all scenarios user is on the login page of the seamlessly application
    Given  user is on the login page of the seamlessly application

    Scenario: As a user, I should be able to see listed items under the Activity module
      And  :User click on Activity icon on the module
      Then User should see the listed items under the Activity module

      Scenario:  Verify that  User can see all items list ordered by newest to oldest
        And  :User click on Activity icon on the module
        Then  User can see all items list ordered by newest to oldest

      Scenario:  AS User should see "No more events to load" message at the end of the "All Activities" tab.
        And  :User click on Activity icon on the module
        Then : user sees No more events to load.
