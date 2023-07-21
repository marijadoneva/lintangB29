package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewContact_Page {

    public NewContact_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="new-contact-button")
    public WebElement newContactButton;

    @FindBy(id="contact-fullname")
    public WebElement contactName;

    @FindBy(id="everyone")
    public WebElement allContacts;

    public void newContact(String name){
        Actions actions=new Actions(Driver.getDriver());
        actions.doubleClick(contactName).perform();

        contactName.sendKeys(Keys.BACK_SPACE);
        contactName.sendKeys(name);
        allContacts.click();

    }


    @FindBy(xpath="(//div[@class='app-navigation-entry__utils'])[1]")
    public WebElement numOfContacts;

    @FindBy(id="notgrouped")
    public WebElement notGrouped;


    @FindBy(xpath = "//span[@class='option__lineone']")
    public List<WebElement> contacts;


    @FindBy(xpath="(//div[@class='app-navigation-entry__counter-wrapper'])[1]")
    public WebElement number;


    @FindBy(xpath="(//span[@class='option__lineone'])[1]")
    public WebElement firstContact;

    @FindBy(xpath="(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[6]")
    public WebElement threeDots;

    @FindBy(xpath="(//span[@class='action-button__icon icon-delete'])[5]")
    public WebElement deleteButton;

    @FindBy(xpath="//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement pictureButton;

    @FindBy(xpath="//span[.='Choose from Files']")
    public WebElement chooseFromButton;

    @FindBy(xpath="//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement pictureButton1;














}
