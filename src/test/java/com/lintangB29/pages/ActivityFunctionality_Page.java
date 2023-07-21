package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityFunctionality_Page {


    public ActivityFunctionality_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//*[@id='appmenu']//a[contains(@href, '/index.php/apps/activity/')]")
    public WebElement ActivityLink;

    @FindBy(xpath = "//div[contains(@class, 'activity') and contains(@class, 'box')]")
    public List<WebElement> Activity;

    @FindBy(id = "no_more_activities")
    public WebElement NoMoreEventsToLoad;

}