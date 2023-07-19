package com.lintangB29.pages;

import com.lintangB29.utilities.ConfigurationReader;
import com.lintangB29.utilities.Driver;
import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.module.Configuration;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user")
    public WebElement usernameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;



    public void login(){
        this.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        this.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        this.loginBtn.click();
    }
}
