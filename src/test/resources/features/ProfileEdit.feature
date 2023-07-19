Feature: Edit/Enter Profile Settings Functionality

  User Story:
  As a user, I should be able to change profile info settings under the Profile module.

  Background: For all scenarios user is on the login page of the seamlessly application
    Given user is on the dashboard page

    Scenario: full name/Email/Phone input boxes should be on the profile page
    When user clicks View Profile settings
    And  user should click settings from view profile
    Then user should see Full name_Email_Phone from the profile page


    Scenario: name on the settings field should be the same with Full Name input box
    When user clicks View Profile settings
    Then user should see name on Settings field should be the same with Full Name input box

  @Positive
  Scenario: user can just pass numbers as phone number
    When user clicks View Profile settings
    And enter phone number in to the input box
    Then user can pass numbers as phone number

   @Negative
  Scenario: any characters except numbers should not be pass
    When user clicks View Profile settings
    And enter phone number in to the input box
    Then user cannot pass any characters except number









