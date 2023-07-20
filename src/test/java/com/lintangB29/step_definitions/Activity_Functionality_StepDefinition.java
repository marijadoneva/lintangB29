package com.lintangB29.step_definitions;

import com.lintangB29.pages.ActivityFunctionality_Page;
;
import com.lintangB29.pages.LoginPage;
import com.lintangB29.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.FindBy;

public class Activity_Functionality_StepDefinition {

  LoginPage loginPage = new LoginPage();


  @Given("user is on the dashboard page")
  public void userIsOnTheDashboardPage() {
    loginPage.login();
  }

  ActivityFunctionality_Page activityFunctionality_page = new ActivityFunctionality_Page();


  @When(":User is  on seamlessly page")
  public void user_is_on_seamlessly_page() {

  }

  @When(":  User click on Activity icon on the dashboard")
  public void user_click_on_activity_icon_on_the_dashboard() {
    BrowserUtils.verifyTitleContains("Activity");
  }


  @Then(": User see the listed items under the Activity module")
  public void userSeeTheListedItemsUnderTheActivityModule() {
    activityFunctionality_page.ActivityLink.click();
  }


  @When(":User is on seamlessly dashboard")
  public void userIsOnSeamlesslyDashboard() {
  }


  @Then(":User see all items listed displayed in the order by newest to oldest on the module")
  public void userSeeAllItemsListedDisplayedInTheOrderByNewestToOldestOnTheModule() {
    activityFunctionality_page.SeesNoMoreEventsToLoad.isDisplayed();
  }


  @When(": User is on seamlessly dashboard page")
  public void userIsOnSeamlesslyDashboardPage() {
  }

//  @And(":User click on Activity icon on the module")
//  public void userClickOnActivityIconOnTheModule() {


  @Then(": user sees No more events to load message at the end of the {string} tab.")
  public void userSeesNoMoreEventsToLoadMessageAtTheEndOfTheTab(String arg0) {
  }


  @Then(": User see all items listed  under the Activity module")
  public void user_see_all_items_listed_under_the_activity_module() {

  }


  @When(":User is on seamlessly dashboard")
  public void user_is_on_seamlessly_dashboard() {
    BrowserUtils.verifyTitleContains("Activity");
  }

  @When(": User click on Activity icon on the module")
  public void user_click_on_activity_icon_on_the_module() {
    activityFunctionality_page.ActivityLink.click();
  }

  @Then(":User see all items list displayed in the order by newest to oldest on the module")
  public void user_see_all_items_list_displayed_in_the_order_by_newest_to_oldest_on_the_module() {
    activityFunctionality_page.SeesNoMoreEventsToLoad.isDisplayed();
  }


  @And(":User click on Activity icon on the module")
  public void userClickOnActivityIconOnTheModule() {
    activityFunctionality_page.ActivityLink.click();
  }

  //@And(": scrolls to the end of the {string} tab")
  //public void scrollsToTheEndOfTheTab(String arg0) {


  @Then(": user see {string}")
  public void userSee(String arg0) {
  }

  @Then(": user sees No more events to load")
  public void userSeesNoMoreEventsToLoad() {
    activityFunctionality_page.NoMoreActivities.isDisplayed();
  }
}





