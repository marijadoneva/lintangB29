package com.lintangB29.step_definitions;

import com.lintangB29.pages.LoginPage;
import com.lintangB29.pages.ProfilePage;
import com.lintangB29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ProfileStepDefinition {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the dashboard page")
    public void userIsOnTheDashboardPage() {loginPage.login();}

    private ProfilePage profilePage;
    @When("user clicks View Profile settings")
    public void userClicksViewProfileSettings()


    @And("user should click settings from view profile")
    public void userShouldClickSettingsFromViewProfile() {
    }

    @Then("user should see Full name_Email_Phone from the profile page")
    public void userShouldSeeFullName_Email_PhoneFromTheProfilePage() {
    }

    @Then("user should see name on Settings field should be the same with Full Name input box")
    public void userShouldSeeNameOnSettingsFieldShouldBeTheSameWithFullNameInputBox() {
    }

    @And("enter phone number in to the input box")
    public void enterPhoneNumberInToTheInputBox() {
    }

    @Then("user can pass numbers as phone number")
    public void userCanPassNumbersAsPhoneNumber() {
    }

    @Then("user cannot pass any characters except number")
    public void userCannotPassAnyCharactersExceptNumber() {
    }
}