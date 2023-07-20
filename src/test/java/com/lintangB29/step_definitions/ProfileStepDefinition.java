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
    ProfilePage profilePage=new ProfilePage();
    @When("user clicks View Profile settings")
    public void userClicksViewProfileSettings(){
    profilePage.ProfileDropDown.click();
    }
    @And("user should click settings from view profile")
    public void userShouldClickSettingsFromViewProfile() {
        profilePage.ProfileSet.click();
    }
    @Then("user should see Full name_Email_Phone from the profile page")
    public void userShouldSeeFullName_Email_PhoneFromTheProfilePage() {
        profilePage.PersonalInfoBtn.click();
        profilePage.FullNameTile.click();
        profilePage.EmailTile.click();
        profilePage.PhoneNumberInput.click();
    }

    @Then("name on the settings field should be the same with Full Name input box")
    public void userShouldSeeNameOnTheSettingsFieldShouldBeTheSameWithFullNameInputBox() {
        profilePage.FullNameInput.click();
        profilePage.ProfileDropDown.click();
        profilePage.ProfileName.click();
    }

    @And("enter phone number into the input box")
    public void enterPhoneNumberInToTheInputBox() {
     profilePage.PhoneBox.click();
    }


    @Then("user can pass {string} as phone number")
    public void userCanPassAsPhoneNumber(String phoneNumber) {
        profilePage.PhoneBox.sendKeys(phoneNumber);
    }

    @Then("user cannot pass any{string}characters except number")
    public void userCannotPassAnyCharactersExceptNumber(String phoneNumber) {
        profilePage.PhoneBox.sendKeys(phoneNumber);
    }
}