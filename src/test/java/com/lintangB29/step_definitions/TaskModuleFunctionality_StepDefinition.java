package com.lintangB29.step_definitions;

import com.lintangB29.pages.BasePage;
import com.lintangB29.pages.TaskModuleFunctionality_Page;
import com.lintangB29.utilities.BrowserUtils;
import com.lintangB29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @When("user clicks on {string}")
    public void user_clicks_on(String task) {

        WebElement wantedTask = Driver.getDriver().findElement(By.xpath("//span[@title='"+task+"']"));
        wantedTask.click();
    }
    @When("user clicks on Add task box")
    public void user_clicks_on_add_task_box() {
        taskModuleFunctionalityPage.addTextBox.click();
    }
    @When("user writes {string}")
    public void user_writes(String string) {
        taskModuleFunctionalityPage.addTextBox.sendKeys(string);
    }
    @Then("user clicks Enter")
    public void user_clicks_enter() {
       taskModuleFunctionalityPage.addTextBox.sendKeys(Keys.ENTER);
    }


    @Then("user can see {string}")
    public void userCanSee(String expected) {
        WebElement expectedTask = Driver.getDriver().findElement(By.xpath("//span[.='"+expected+"']"));
        Assert.assertTrue(expectedTask.isDisplayed());
    }

    @And("user clicks on check box")
    public void userClicksOnCheckBox() {
        BrowserUtils.sleep(2);
        taskModuleFunctionalityPage.checkBox.click();
        BrowserUtils.sleep(4);
    }

    @Then("user should see {string} in tasks list")
    public void userShouldSeeInTasksList(String completed) {
        WebElement neededTask = Driver.getDriver().findElement(By.xpath("//span[@title='"+completed+"']"));
        Assert.assertTrue(neededTask.isDisplayed());

    }

    @Then("user should see the number of {string} tasks")
    public void userShouldSeeTheNumberOfTasks(String completed) {
        WebElement number = Driver.getDriver().findElement(By.xpath(" //li[@id='collection_"+completed+"']/div"));
        Assert.assertTrue(number.isDisplayed());
        BrowserUtils.sleep(2);

    }

    @And("user clicks on star")
    public void userClicksOnStar() {
        taskModuleFunctionalityPage.star.click();
    }

    @Then("user should reset changes")
    public void userShouldResetChanges() {
         taskModuleFunctionalityPage.completed.click();
          BrowserUtils.sleep(3);
          taskModuleFunctionalityPage.completedCheckmark.click();
    }

    @Then("user should reset")
    public void userShouldReset() {
        taskModuleFunctionalityPage.important.click();
        BrowserUtils.sleep(2);
        taskModuleFunctionalityPage.completedStar.click();
    }

    @And("user clicks on three dots")
    public void userClicksOnDots() {
        BrowserUtils.sleep(3);
        taskModuleFunctionalityPage.threeDots.click();
        BrowserUtils.sleep(3);
    }

    @And("user clicks on delete")
    public void userClicksOnDelete() {
        BrowserUtils.sleep(2);
        taskModuleFunctionalityPage.delete.click();
        BrowserUtils.sleep(10);
    }


    //  @And("user clicks on check box for {string}")
    //public void userClicksOnCheckBoxFor(String task) {

//        Assert.assertTrue(BrowserUtils.getElementsText(taskModuleFunctionalityPage.checkBoxes).contains(task));

//        BrowserUtils.sleep(3);
//        for (WebElement each : taskModuleFunctionalityPage.checkBoxes) {
//
//            if (each.getText().equals(task)){
//                each.click();
//
//            }else {
//                System.out.println("Error");
//                System.out.println(each.getText());
//            }
//        }
//        BrowserUtils.sleep(3);

    }




