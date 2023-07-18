Feature: Edit/Enter Profile Settings Functionality

  User Story:
  As a user, I should be able to change profile info settings under the Profile module.

  Background: For all scenarios user is on the login page of the seamlessly application
    Given user is on the login page of the seamlessly application
    When user enters "Employee30" username
    And user enters "Employee123" password
    And user clicks Log in
    Then user should see the dashboard
    When User can see at least following titles inside “Personal Info” under Profile Settings page   => Full name/Email/Phone Number
    And Name of the user in the Settings field should be the same with Full Name input box
    And User cannot pass any characters except numbers into the "Phone Number" input box


