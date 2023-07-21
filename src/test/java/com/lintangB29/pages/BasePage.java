package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//li[@data-id='contacts'])[1]")
    public WebElement Contacts;

    @FindBy(xpath = "(//li[@data-id='dashboard'])[1]")
    public WebElement Dashboard;

    @FindBy(xpath = "(//li[@data-id='tasks'])[1]")
    public WebElement Task;




}
