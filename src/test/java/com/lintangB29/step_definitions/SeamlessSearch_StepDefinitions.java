package com.lintangB29.step_definitions;

import com.lintangB29.pages.SeamlessSearchPage;
import com.lintangB29.pages.SeamlessSearchResultPage;
import com.lintangB29.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.Keys.ENTER;

public class SeamlessSearch_StepDefinitions {

    SeamlessSearchPage seamlessSearchPage = new SeamlessSearchPage();

    @When("user searches the file {string} in the search icon")
    public void user_searches_the_file_in_the_search_icon(String searchValue) {
        seamlessSearchPage.searchIcon.click();
       seamlessSearchPage.searchBar.sendKeys(searchValue);
       BrowserUtils.sleep(2);


    }

    @When("user presses Enter")
    public void user_presses_enter() {
        seamlessSearchPage.searchBar.submit();
        BrowserUtils.sleep(2);


    }
    @Then("user should see relevant file {string} matching the search query in title")
    public void userShouldSeeRelevantFileMatchingTheSearchQueryInTitle(String expectedInTitle) {

        BrowserUtils.verifyTitleContains(expectedInTitle);

    }


    SeamlessSearchResultPage seamlessSearchResultPage=new SeamlessSearchResultPage();
    @And("user clicks on the close icon of the image displayed")
    public void userClicksOnTheCloseIconOfTheImageDisplayed() {
        BrowserUtils.sleep(2);
        seamlessSearchResultPage.closeIcon.click();

    }
    @And("user clicks on the App icon at the top left corner of the page")
    public void userClicksOnTheAppIconAtTheTopLeftCornerOfThePage() {
        seamlessSearchResultPage.appIcon.click();
    }

    @Then("user should be redirected to the Dashboard page")
    public void userShouldBeRedirectedToTheDashboardPage() {
        BrowserUtils.verifyTitle("Dashboard - Seamlessly");
    }

    @When("user enters {string} in the search bar")
    public void userEntersInTheSearchBar(String nameSearch) {
        seamlessSearchPage.searchIcon.click();
        seamlessSearchPage.searchBar.sendKeys(nameSearch);
        BrowserUtils.sleep(2);

    }


    @And("user clicks on the search button or press Enter")
    public void userClicksOnTheSearchButtonOrPressEnter() {

        seamlessSearchPage.searchBar.submit();
        BrowserUtils.sleep(2);


    }


    @Then("the system should display the contact searched {string}")
    public void theSystemShouldDisplayTheContactSearched(String nameSearch) {

        Assert.assertTrue("Contact is NOT displayed", nameSearch.isBlank());

    }

    @Then("system should display error message")
    public void systemShouldDisplayErrorMessage() {

       Assert.assertTrue( seamlessSearchPage.errorMessage.isDisplayed() );


    }



}
