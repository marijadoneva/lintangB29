Feature: Seamlessly File and contact Search verification

  User Story:
  As a user, I should be able to search file or contact
  from the Dashboard

  Background: For all scenarios user is already logged in and on the Dashboard page
    Given user is on the dashboard page


@wip
  Scenario:Search for a file from the Dashboard using the magnifying glass icon inside any Module
    When user searches the file "pngtree" in the search icon
    And user presses Enter
    Then user should see relevant file "pngtree" matching the search query in title



  Scenario: Search for a contact from the Dashboard
    When user enters "Tom Hilson" in the search bar
    And user clicks on the search button or press Enter
    Then user should see relevant contacts matching the search query
    And the search results should not display irrelevant contacts


@negative
  Scenario: Search for a contact from the Dashboard
    When user enters "Hanan" in the search bar
    And user clicks on the search button or press Enter
    Then system should display error message
    And the search results should not display irrelevant contacts


@wip
  Scenario:  user navigates to the Dashboard page by clicking the App icon
    When user searches the file "pngtree" in the search icon
    And user presses Enter
    And user clicks on the close icon of the image displayed
    And  user clicks on the App icon at the top left corner of the page
    Then user should be redirected to the Dashboard page











