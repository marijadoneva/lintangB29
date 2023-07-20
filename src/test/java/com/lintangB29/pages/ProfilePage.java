package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProfilePage {
    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"expanddiv\"]")
    public WebElement ProfileDropDown;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[2]")
    public WebElement ProfileSet;

    @FindBy (xpath = "//*[@id=\"app-navigation\"]/ul/li[1]/a/span")
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
    public WebElement MobileInput;

    public WebElement getProfileDropDown() {
        return ProfileDropDown;

        public WebElement getProfileSet() {
            return ProfileSet;
        }

        public WebElement getPersonalInfoBtn() {
            return PersonalInfoBtn;
        }

        public WebElement getFullNameTile() {
            return FullNameTile;
        }

        public WebElement getEmailTile() {
            return EmailTile;
        }

        public WebElement getPhoneNumberInput() {
            return PhoneNumberInput;
        }

        public WebElement getFullNameInput() {
            return FullNameInput;
        }

        public WebElement getProfileName() {
            return ProfileName;
        }

        public WebElement getMobileInput() {
            return MobileInput;
        }

        ProfilePage profilePage = new ProfilePage();
        WebElement profileDropDownElement = profilePage.getProfileDropDown();

    }
}







