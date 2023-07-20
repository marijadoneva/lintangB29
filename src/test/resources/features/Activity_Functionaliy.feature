Feature: Activity Functionality

  User Story: As a user, I should be able to see listed items under the Activity module.

  Background: For all scenarios user is on the login page of the seamlessly application
    Given  user is on the login page of the seamlessly application

    Scenario: As a user, I should be able to see listed items under the Activity module
      When :User is  on seamlessly page
      And :  User click on Activity icon on the dashboard
      Then : User see the listed items under the Activity module


      Scenario:  Verify that  User can see all items list ordered by newest to oldest
        When :User is on seamlessly dashboard
        And : User click on Activity icon on the module
        Then :User see all items listed displayed in the order by newest to oldest on the module

      Scenario:  AS User should see "No more events to load" message at the end of the "All Activities" tab.
        When : User is on seamlessly dashboard page
        And  :User click on Activity icon on the module
        Then : user sees No more events to load message at the end of the "All Activities" tab.
