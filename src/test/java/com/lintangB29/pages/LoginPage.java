package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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



    /**
     * This method will log in with credentials that are
     * provided in the method at the time of calling it
     * @param user Employee80
     * @param pass Employee123
     */
    public void login(String user, String pass){
        this.usernameBox.sendKeys(user);
        this.passwordBox.sendKeys(pass);
        this.loginBtn.click();
    }
}
