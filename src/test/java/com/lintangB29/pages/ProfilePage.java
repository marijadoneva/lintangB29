package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProfilePage {
    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"settings\"]")
    public WebElement ProfileDropDown;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[2]")
    public WebElement ProfileSet;

    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[1]/a/span")
    public WebElement PersonalInfoBtn;

    @FindBy(xpath = "//*[@id=\"personal-settings\"]/div[2]/div[1]/section/h3/label")
    public WebElement FullNameTile;

    @FindBy(xpath = "//*[@id=\"personal-settings\"]/div[2]/div[2]/section/h3/label")
    public WebElement EmailTile;

    @FindBy(xpath = "//*[@id=\"phoneform\"]/h3/label")
    public WebElement PhoneNumberInput;

    @FindBy(xpath = "//*[@id=\"displayname\"]")
    public WebElement FullNameInput;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[1]/div/a[1]/div[1]/div[1]")
    public WebElement ProfileName;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    public WebElement PhoneBox;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement PassNumber;

}






