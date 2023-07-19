package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContact_Page {

    public NewContact_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="new-contact-button")
    public WebElement newContactButton;

    @FindBy(id="//input[@id='contact-fullname']")
    public WebElement nameBox;




}
