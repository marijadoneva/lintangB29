package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeamlessSearchResultPage extends SeamlessSearchPage {

    public SeamlessSearchResultPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//button[@class='action-item action-item--single header-close undefined undefined has-tooltip']")
    public WebElement closeIcon;


    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement appIcon;


}
