package com.lintangB29.step_definitions;

import com.lintangB29.pages.UploadEditDelete_Page;
import com.lintangB29.utilities.BrowserUtils;
import com.lintangB29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class UploadEditDelete_StepDefinition {



    UploadEditDelete_Page uploadEditDeletePage = new UploadEditDelete_Page();


    @When("User enters on {string} module page")
    public void user_enters_on_module_page(String string) {
uploadEditDeletePage.fileIcon.click();

    }

    @When("User click on the Upload file button")
    public void user_click_on_the_upload_file_button() {
uploadEditDeletePage.plusIcon.click();
    }


    @And("User can select file {string}")
    public void user_can_select_file(String path) {

        path = "C:/Users/chimi/OneDrive/Desktop/file.txt";

        uploadEditDeletePage.uploadFile.sendKeys(path);
        BrowserUtils.waitFor(5);
        WebElement uploadButton = Driver.getDriver().findElement(By.id("path"));
        uploadButton.click();

    }

    @Then("User can see {string} uploading file on the list")
    public void user_can_see_uploading_file_on_the_list(String path) {

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//span[.='"+path+"'])[span()]")).getText().equals(path));

    }


    @When("user navigates on {string} module page")
    public void user_navigates_on_module_page(String string) {
        uploadEditDeletePage.fileIcon.click();
    }
    @Then("user clicks on add button")
    public void user_clicks_on_add_button() {
        uploadEditDeletePage.plusIcon.click();
    }
    @Then("user creates new folder")
    public void user_creates_new_folder() {
uploadEditDeletePage.createFile.click();

    }
    @Then("user name the folder")
    public void user_name_the_folder() {
uploadEditDeletePage.createFolder.submit();
BrowserUtils.waitFor(5);
    }
    @Then("User creating New Folder, it can be see in the list")
    public void user_creating_new_folder_it_can_be_see_in_the_list() {

    }

    @Then("user clicks on three dots of selected item")
    public void user_clicks_on_three_dots_of_selected_item() {
uploadEditDeletePage.threeDots.click();
    }
    @Then("clicks on delete folder or file")
    public void clicks_on_delete_folder_or_file() {
uploadEditDeletePage.deleteButton.click();
    }
    @Then("User can deleting any selected item from its three dots menu")
    public void user_can_deleting_any_selected_item_from_its_three_dots_menu() {

    }

    @Then("User can see the total number of the files and folders under the files list table")
    public void user_can_see_the_total_number_of_the_files_and_folders_under_the_files_list_table() {
Assert.assertTrue(uploadEditDeletePage.numberAndFile.isDisplayed());
BrowserUtils.waitFor(5);
    }




}

