package com.lintangB29.step_definitions;

import com.lintangB29.pages.SeamlesslyModulesPage;
import com.lintangB29.utilities.BrowserUtils;
import com.lintangB29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class DashboardFunctionality_StepDefinition {

    SeamlesslyModulesPage modulesPage = new SeamlesslyModulesPage();
    @Given("User is on the homepage")
    public void userIsOnTheHomepage() {
        BrowserUtils.verifyTitleContains("Dashboard");
    }

    @Then("user can see  all modules on the top left")
    public void userCanSeeAllModulesOnTheTopLeft(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : modulesPage.allModels) {

            actualModules.add(eachModule.getAttribute("aria-label"));

        }

        BrowserUtils.waitForPageToLoad(3);

        Assert.assertEquals(expectedModules,actualModules);


    }

    @Then("user can click on Customize button")
    public void userCanClickOnCustomizeButton() {

       modulesPage.CustomizeButton.click();
    }

   // @And("user can select any of the Widgets from dashboard")
   // public void userCanSelectAnyOfTheWidgetsFromDashboard(List<String> expectedCustomize) {
        //  System.out.println("expectedCustomize = " + expectedCustomize);
        //List<String> actualCustomize = new ArrayList<>();
        //for (int i = 0; i < expectedCustomize.size(); i++) {
            //String locator = "//label[normalize-space(text())='" + expectedCustomize.get(i) + "']";
           // WebElement eachWidget = Driver.getDriver().findElement(By.xpath(locator));
           // actualCustomize.add(eachWidget.getText());

           // if (!eachWidget.isSelected()) {//if it not selected
              //  eachWidget.click();//select it
           // }
//               BrowserUtils.sleep(2);
            //assert if it selected
            // System.out.println(actualCustomize);
            // Assert.assertTrue(eachWidget.isSelected());
            // Assert.assertTrue(actualCustomize.get(i));
        //}
           // Assert.assertEquals(expectedCustomize, actualCustomize);//assert if 2 lists are equal
        //}


    @When("user can click on Set Status button")
    public void userCanClickOnSetStatusButton() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.waitForClickablility(modulesPage.setStatus,3);
        actions.moveToElement( modulesPage.setStatus).click().perform();//click on set status
        actions.moveToElement(modulesPage.online).click().perform();
        Assert.assertTrue(modulesPage.online.isSelected());
        actions.moveToElement(modulesPage.away).click().perform();
        Assert.assertTrue(modulesPage.away.isSelected());
        actions.moveToElement(modulesPage.doNotDistribute).click().perform();
        Assert.assertTrue(modulesPage.doNotDistribute.isSelected());
        actions.moveToElement(modulesPage.invisible).click().perform();
        Assert.assertTrue(modulesPage.invisible.isSelected());


    }

    @Then("user can select any of the Status options")
    public void userCanSelectAnyOfTheStatusOptions() {
    }

    @Then("user can click on x Button to close the Widgets")
    public void userCanClickOnXButtonToCloseTheWidgets() {
        modulesPage.XButton.click();
    }

    @And("user can select any of the Widgets from dashboard")
    public void userCanSelectAnyOfTheWidgetsFromDashboard() {
     modulesPage.checkstutes.click();
    }

    @Then("user can click on x Button to close the Set Status")
    public void userCanClickOnXButtonToCloseTheSetStatus() {
        modulesPage.XButton.click();
    }
}
