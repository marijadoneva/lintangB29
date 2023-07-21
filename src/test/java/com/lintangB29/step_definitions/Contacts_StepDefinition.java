package com.lintangB29.step_definitions;

import com.lintangB29.pages.BasePage;
import com.lintangB29.pages.LoginPage;
import com.lintangB29.pages.NewContact_Page;
import com.lintangB29.utilities.BrowserUtils;
import com.lintangB29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Contacts_StepDefinition {
    LoginPage loginPage = new LoginPage();
    BasePage basePage= new BasePage();
    NewContact_Page newContactPage = new NewContact_Page();


    @Given("user is on the dashboard page")
    public void userIsOnTheDashboardPage() {
        loginPage.login();
    }

    @When("user navigates to Contact module")
    public void user_navigates_to_contact_module() {
        basePage.Contacts.click();
    }
    @When("user clicks on new contact button")
    public void user_clicks_on_new_contact_button() {

        newContactPage.newContactButton.click();

    }
    @When("user fills {string}")
    public void user_fills(String name) {
       newContactPage.newContact(name);
    }

    @Then("user should see {string} in all contact list")
    public void user_should_see_in_all_contact_list(String expectedName) {
        BrowserUtils.sleep(2);
        List<String>expectedNames= BrowserUtils.getElementsText(newContactPage.allContactslist);


    }


    @And("user clicks on All contact button")
    public void userClicksOnAllContactButton() {
        newContactPage.allContacts.click();
    }


    @And("user should see all contacts")
    public void userShouldSeeAllContacts() {

    }

    @Then("user should see the total number of contacts")
    public void userShouldSeeTheTotalNumberOfContacts() {
        Assert.assertTrue(newContactPage.number.isDisplayed());
    }

    @And("user clicks on the first contact")
    public void userClicksOnTheFirstContact() {
        newContactPage.firstContact.click();
    }

    @And("user clicks on the three dots")
    public void userClicksOnTheThreeDots() {
       newContactPage.threeDots.click();
    }

    @Then("user clicks on delete button")
    public void userClicksOnDeleteButton() {
        newContactPage.deleteButton.click();
    }

    @Then("user should not see the first contact in the ALl Contact list")
    public void userShouldNotSeeTheFirstContactInTheALlContactList() {

    }

    @And("user clicks on the picture icon")
    public void userClicksOnThePictureIcon() {
        newContactPage.pictureButton.click();
    }

    @And("user clicks on From your file folder")
    public void userClicksOnFromYourFileFolder() {
        newContactPage.chooseFromButton.click();
    }

    @Then("user clicks on wanted photo")
    public void userClicksOnWantedPhoto() {
        newContactPage.selectedPicture.click();
    }

    @Then("user clicks on Choose button")
    public void userClicksOnChooseButton() {
        newContactPage.chooseButton.click();
        BrowserUtils.verifyElementDisplayed(newContactPage.newPicture);

    }



}

