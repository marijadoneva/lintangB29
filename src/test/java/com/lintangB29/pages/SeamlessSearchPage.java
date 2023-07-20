package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeamlessSearchPage extends LoginPage {

public SeamlessSearchPage(){
    PageFactory.initElements(Driver.getDriver(),this);

}

@FindBy(className = "material-design-icon__svg")
//@FindBy(xpath = "//div[@id='unified-search']")
    public WebElement searchIcon;

@FindBy(xpath = "//input[@placeholder='Search Apps, Notes, Files, Circles, Comments, Deck, Card comments, Contacts, Events, Tasks, Settings …']")
public WebElement searchBar;

@FindBy(xpath = "//h3[@title='pngtree-sun-sunshine-png-image_8977147.png']")
    public WebElement searchFile;











}
