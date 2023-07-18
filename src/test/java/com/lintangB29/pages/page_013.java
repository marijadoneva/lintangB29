package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page_013 {
    public page_013() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id=\"expand\"]")
    public WebElement profileIcon;

}
