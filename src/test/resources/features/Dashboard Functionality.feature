@1
Feature: As a user I should be able to modify Dashboard page

  Background: For all scenarios user is on the login page of the seamlessly application
    Given user is on the dashboard page

  Scenario: Seamlessly modules and username
    Given User is on the homepage
    Then user can see  all modules on the top left
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Contacts  |
      | Calendar  |
      | Notes     |
      | Deck      |
      | Tasks     |
      | More apps |

  Scenario: Seamlessly Customize button
    Given user can click on Customize button
    And user can select any of the Widgets from dashboard
      | Status            |
      | Weather           |
      | Recommended files |
      | Recent activity   |
      | Upcoming events   |
      | Upcoming cards    |
      | Notes             |
      | Upcoming tasks    |
      | Recent statuses   |

  @1
  Scenario: Seamlessly Set Status
    Given User is on the homepage
    When user can click on Set Status button
    Then user can select any of the Status options



     #Acceptance Criteria
     #
     #1 - After Login user can see all modules and Username.
     #2 - User can click on Customize button and select any of the Widgets.
     #3 - User can click on Set Status button and select any of the Status options.