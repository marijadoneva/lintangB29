package com.lintangB29.step_definitions;

import com.lintangB29.pages.BasePage;
import com.lintangB29.pages.TaskModuleFunctionality_Page;
import com.lintangB29.utilities.BrowserUtils;
import com.lintangB29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class TaskModuleFunctionality_StepDefinition {


    BasePage basePage = new BasePage();
    TaskModuleFunctionality_Page taskModuleFunctionalityPage= new TaskModuleFunctionality_Page();


    public static List<WebElement> listAllTaskWebElement(){
        List<WebElement>allTasksWebElement= Driver.getDriver().findElements(By.xpath("//div[@class='draggable-container']/li"));
        return allTasksWebElement;
    }

    public static List<String> listOfAllTaskString(){

        List<String> textOfAllTask = new ArrayList<>();
        for (WebElement tasks : listAllTaskWebElement()) {
            textOfAllTask.add(tasks.getText());
        }
        return textOfAllTask;
    }


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
        taskModuleFunctionalityPage.newListBox.sendKeys(string);
        BrowserUtils.sleep(2);
    }
    @When("user clicks Checkmark button")
    public void user_clicks_checkmark_button() {
        taskModuleFunctionalityPage.checkmarkButton.click();
    }
    @Then("user should see {string}")
    public void user_should_see(String expectedTask) {
        BrowserUtils.sleep(5);
        System.out.println(listOfAllTaskString());
        Assert.assertTrue(BrowserUtils.getElementsText(taskModuleFunctionalityPage.allList).contains(expectedTask));

    }

}
