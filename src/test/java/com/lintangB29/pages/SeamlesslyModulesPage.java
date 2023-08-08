package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SeamlesslyModulesPage extends LoginPage {
  public SeamlesslyModulesPage() {


      PageFactory.initElements(Driver.getDriver(), this);
    }
/*
    @FindBy(xpath = "//span[text()='Dashboard']")
    public WebElement Dashboard;

    @FindBy(xpath = "//span[text()='Files']")
    public WebElement Files;

    @FindBy(xpath = "//span[text()='Photos']")
    public WebElement Photos;

    @FindBy(xpath = "//span[text()='Activity']")
    public WebElement Activity;

    @FindBy(xpath = "//span[text() = 'Contacts']")
    public WebElement Contacts;

    @FindBy(xpath = "//span[text() = 'Calendar']")
    public WebElement Calendar;

    @FindBy(xpath = "//span[text() = 'Notes']")
    public WebElement Notes;

    @FindBy(xpath = "//span[text() = 'Deck']")
    public WebElement Deck;

    @FindBy(xpath = "//span[text() = 'Tasks']")
    public WebElement Tasks;


 */

  @FindBy(xpath = "//ul[@id='appmenu']//li/a")
  public List<WebElement> allModels;


  @FindBy(xpath = "//input[@type='checkbox']")
  public List<WebElement> editWidgets;

/*
    @FindBy(xpath = "//div[@aria-label='Avatar of EMPLOYEE 10, online']//img")
    public WebElement username;
  // "//div[@class = 'avatardiv popovermenu-wrapper']")
  */
    @FindBy(xpath = "//a[text()='Customize']")
    public WebElement CustomizeButton;
    @FindBy(xpath = "//label[@class='icon-user-status-online']")
    public WebElement checkstutes;

    @FindBy(xpath = "//button[@class='action-item action-item--single header-close undefined undefined has-tooltip']")
    public WebElement XButton;
    /*

    @FindBy(xpath = "//label[@class = 'icon-user-status-online']")
    public WebElement widgetStatus;

    @FindBy(xpath = "//label[@class = 'icon-weather-status']")
    public WebElement widgetWeather;

    @FindBy(xpath = "//label[@class = 'icon-activity']")
    public WebElement widgetActivity;

    @FindBy(xpath = "//label[@class = 'icon-calendar-dark']")
    public WebElement widgetEvents;

    @FindBy(xpath = "//label[@class = 'icon-deck']")
    public WebElement widgetCards;

    @FindBy(xpath = "//label[@class = 'icon-notes']")
    public WebElement widgetNotes;

    @FindBy(xpath = "label[@class = 'icon-files-dark']")
    public WebElement widgetFiles;

    @FindBy(xpath = "label[@class = 'icon-tasks']")
    public WebElement widgetTasks;

 */

  @FindBy(xpath = "//button[normalize-space(text())='Set status']")
  public WebElement setStatus;


  /*
    @FindBy(xpath = "//button[@class ='user-status-menu-item__toggle user-status-menu-item__toggle--inline']")
    public WebElement status;
*/
    @FindBy(xpath = "//label[@class = 'user-status-online-select__label icon-user-status-online']")
    public WebElement online;

    @FindBy(xpath = "//label[@class = 'user-status-online-select__label icon-user-status-dnd' ]")
    public WebElement doNotDistribute;

    @FindBy(xpath = "//label[@class = 'user-status-online-select__label icon-user-status-away']")
    public WebElement away;

    @FindBy(xpath = "//label[@class = 'user-status-online-select__label icon-user-status-invisible']")
    public WebElement invisible;

    @FindBy(xpath= "//button[@class ='action-item action-item--single header-close undefined undefined has-tooltip']")
    public WebElement XCross;



  }
