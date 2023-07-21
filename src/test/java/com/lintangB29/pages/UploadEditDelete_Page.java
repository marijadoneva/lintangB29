package com.lintangB29.pages;

import com.lintangB29.utilities.BrowserUtils;
import com.lintangB29.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadEditDelete_Page {

    public UploadEditDelete_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "//ul[@class='inverted']//li[@data-id='files']")
    public WebElement fileIcon;


    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusIcon;

    @FindBy(xpath = "//input[@type='file']//label[@class='menuitem']")
    public  WebElement uploadFile;


  // WebElement chooseFileButton = Driver.getDriver().findElement(By.id(""));

@FindBy(xpath = "//a[@class='button new']")
    public WebElement createFile;

@FindBy(xpath = "//form[@class='filenameform']//input[@type='submit']" )
public WebElement createFolder;


@FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement threeDots;

@FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    public WebElement deleteButton;



@FindBy(xpath = "//td[@class='filesummary']")
    public WebElement numberAndFile;













}
