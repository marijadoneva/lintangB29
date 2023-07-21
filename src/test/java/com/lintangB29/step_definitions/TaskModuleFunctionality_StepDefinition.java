package com.lintangB29.step_definitions;

import com.lintangB29.pages.BasePage;
import com.lintangB29.pages.TaskModuleFunctionality_Page;
import com.lintangB29.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TaskModuleFunctionality_StepDefinition {

    BasePage basePage = new BasePage();
    TaskModuleFunctionality_Page taskModuleFunctionalityPage= new TaskModuleFunctionality_Page();

    @When("user navigates to Tasks module")
    public void user_navigates_to_tasks_module() {
        basePage.Task.click();
    }
    @When("user clicks on Add list button")
    public void user_clicks_on_add_list_button() {
        BrowserUtils.sleep(5);
        taskModuleFunctionalityPage.addListButton.click();
        BrowserUtils.sleep(2);
    }
    @When("user fills {string} box")
    public void user_fills_box(String string) {
        taskModuleFunctionalityPage.newListBox.click();
        BrowserUtils.sleep(3);
        taskModuleFunctionalityPage.newListBox.sendKeys(string);
        BrowserUtils.sleep(5);
    }
    @When("user clicks Checkmark button")
    public void user_clicks_checkmark_button() {
        taskModuleFunctionalityPage.checkmarkButton.click();
    }
    @Then("user should see {string}")
    public void user_should_see(String expectedTask) {

        Assert.assertTrue(taskModuleFunctionalityPage.allList.contains(expectedTask));
    }

    @And("user fills box")
    public void userFillsBox() {
        taskModuleFunctionalityPage.newListBox.click();
        BrowserUtils.sleep(3);
        taskModuleFunctionalityPage.newListBox.sendKeys("School");
        BrowserUtils.sleep(5);
    }
}
