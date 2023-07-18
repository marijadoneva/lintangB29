package com.lintangB29.step_definitions;

import com.lintangB29.pages.LoginPage;
import io.cucumber.java.en.Given;

public class Contacts_StepDefinition {
    LoginPage loginPage = new LoginPage();


    @Given("user is on the dashboard page")
    public void userIsOnTheDashboardPage() {
        loginPage.login();
    }


}
