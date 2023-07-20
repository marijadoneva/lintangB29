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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

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
       BrowserUtils.sleep(3);
    }


    @And("user clicks on All contact button")
    public void userClicksOnAllContactButton() {
        newContactPage.notGrouped.click();
    }


    @And("user should see all contacts")
    public void userShouldSeeAllContacts() {

        for (WebElement each: newContactPage.contacts) {
            System.out.println(each.getText());
        }

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

    @And("user clicks on the picture icon")
    public void userClicksOnThePictureIcon() {
    }

    @And("user clicks on From your file folder")
    public void userClicksOnFromYourFileFolder() {
    }

    @Then("user clicks on wanted photo")
    public void userClicksOnWantedPhoto() {
    }

    @Then("user clicks on Choose button")
    public void userClicksOnChooseButton() {
    }
}
