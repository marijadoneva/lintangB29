package com.lintangB29.pages;

import com.google.common.base.Predicates;
import com.lintangB29.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TaskModuleFunctionality_Page {


    public TaskModuleFunctionality_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //@FindBy(xpath = "(//li[@class='app-navigation-entry collection reactive'])[7]")
    @FindBy(xpath = "//span[@title='Add List…']")
    public WebElement addListButton;

    @FindBy(id = "newListInput")
    public WebElement newListBox;

    @FindBy(xpath = "//li[@class='app-navigation-entry collection reactive collection--edit']//input[@title='Save']")
    public WebElement checkmarkButton;

    @FindBy(xpath = "//div[@class='draggable-container']/li")
    public List<WebElement> allList;

   // @FindBy(xpath = "//input[@placeholder='Add a task to \"College\"…']")
   @FindBy(xpath = "//div[@class='header__input']//input[@class='transparent reactive']")
    public WebElement addTextBox;




















    }

