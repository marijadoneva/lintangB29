package com.lintangB29.step_definitions;
import com.lintangB29.pages.ActivityFunctionality_Page;
import com.lintangB29.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity_Functionality_StepDefinition {

  ActivityFunctionality_Page activityFunctionality_page = new ActivityFunctionality_Page();

  @Given("User is on seamlessly dashboard page")
  public void user_is_on_seamlessly_dashboard_page() {
    BrowserUtils.verifyTitleContains("Activity");
  }

  @When("User click on Activity icon on the dashboard")
  public void user_click_on_activity_icon_on_the_dashboard() {
    BrowserUtils.verifyTitleContains("Activity");
  }

  @Then("User should see the listed items under the Activity module")
  public void userShouldSeeTheListedItemsUnderTheActivityModule() {
    activityFunctionality_page.Activity.stream().findFirst();
  }

  @When(":User click on Activity icon on the module")
  public void userClickOnActivityIconOnTheModule() {
    activityFunctionality_page.ActivityLink.click();
  }

    @Then("User can see all items list ordered by newest to oldest")
    public void user_can_see_all_items_list_ordered_by_newest_to_oldest () {
      activityFunctionality_page.Activity.stream().distinct();
  }

  @Then(": user sees No more events to load.")
  public void userSeesNoMoreEventsToLoad (){
    activityFunctionality_page.NoMoreEventsToLoad.isDisplayed();
  }

}