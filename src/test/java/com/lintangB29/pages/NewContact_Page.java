package com.lintangB29.pages;

import com.lintangB29.utilities.BrowserUtils;
import com.lintangB29.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
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
    public WebElement allContactsButton;

    public void newContact(String name){
        Actions actions=new Actions(Driver.getDriver());
        actions.doubleClick(contactName).perform();

        contactName.sendKeys(Keys.BACK_SPACE);
        BrowserUtils.sleep(2);
        contactName.sendKeys(name);
        BrowserUtils.waitForInvisibilityOf(warning);
        contactName.sendKeys(Keys.ENTER);

        newContactButton.click();
        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().refresh();
        BrowserUtils.sleep(3);


    }

    @FindBy(xpath = "//a[@class='header-icon icon-error header-icon--pulse has-tooltip']")
    public WebElement warning;

    @FindBy(xpath="(//div[@class='app-navigation-entry__utils'])[1]")
    public WebElement numOfContacts;

    @FindBy(id="everyone")
    public WebElement allContacts;


   // @FindBy(xpath = "//span[@class='option__lineone']")
    //public List<WebElement> contacts;
   @FindBy(xpath = "//div[@role='listitem']")
   public List<WebElement>allContactslist;

   public static List<WebElement> listOfAllContactWebElement(){
       List<WebElement> allContactsWebElements = Driver.getDriver().findElements(By.xpath("//div[@role='listitem']"));
       return allContactsWebElements;
   }

   public static List<String> listOfAllContacts(){

       List<String> textOfAllContactsList = new ArrayList<>();
       for (WebElement contact : listOfAllContactWebElement()) {
           textOfAllContactsList.add(contact.getText());
       }
       return textOfAllContactsList;
   }


    @FindBy(xpath="(//div[@class='app-navigation-entry__counter-wrapper'])[1]")
    public WebElement number;


    @FindBy(xpath="(//span[@class='option__lineone'])[1]")
    public WebElement firstContact;


    @FindBy(xpath = "(//button[@aria-label='Actions'])[7]")
    public WebElement threeDots;


    @FindBy(xpath="(//span[@class='action-button__icon icon-delete'])[5]")
    public WebElement deleteButton;

    @FindBy(xpath="//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement pictureButton;

   // @FindBy(xpath="//span[.='Choose from Files']")
    @FindBy(xpath = "(//button[@class='action-button focusable'])[8]")
    public WebElement chooseFromButton;

    @FindBy(xpath="//table[@id='picker-filestable']//tr[@data-entryname][2]")
    public WebElement selectedPicture;

    @FindBy(xpath= "//button[.='Choose']")
    public WebElement chooseButton;

    @FindBy(xpath= "//button[.='Choose']")
    public WebElement previousPicture;

    @FindBy(xpath= "//img[@src='blob:https://qa.seamlessly.net/0531f41f-c644-4292-90a3-b9cb3c58a70e']")
    public WebElement newPicture;

















}
