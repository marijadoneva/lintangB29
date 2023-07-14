package com.lintangB29.step_definitions;

import com.lintangB29.pages.LoginPage;
import com.lintangB29.pages.MainPage;
import com.lintangB29.utilities.BrowserUtils;
import com.lintangB29.utilities.ConfigurationReader;
import com.lintangB29.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.module.Configuration;

public class Login_StepDefinition {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page of the seamlessly application")
    public void user_is_on_the_login_page_of_the_seamlessly_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        mainPage.Login.click();
    }

    @When("user enters {string} username")
    public void user_enters_username(String username) {
       loginPage.usernameBox.sendKeys(username);
    }
    @When("user enters {string} password")
    public void user_enters_password(String password) {
        loginPage.passwordBox.sendKeys(password);
    }
    @When("user clicks Log in")
    public void user_clicks_log_in() {
        loginPage.loginBtn.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        BrowserUtils.verifyTitleContains("File");
    }
}
