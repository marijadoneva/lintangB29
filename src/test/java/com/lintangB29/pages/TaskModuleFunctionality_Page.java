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

    @FindBy(xpath = "(//div[@class='task-checkbox no-nav'])[2]")
    public WebElement checkBox;

    @FindBy(xpath = "//div[@class='task-checkbox no-nav']")
    public List<WebElement>checkBoxes;



    @FindBy(xpath = "//li[@id='collection_completed']")
    public WebElement completed;

    @FindBy(xpath = "//li[@id='collection_starred']")
    public WebElement important;

    @FindBy(xpath = "//li[@class='task-item']//button[@class='action-item action-item--single reactive no-nav undefined undefined priority priority--high has-tooltip']")
    public WebElement completedStar;



    @FindBy(xpath = "//li[@id='collection_completed']//div[@class='app-navigation-entry__utils']")
    public WebElement number;

    @FindBy(xpath = "//li[@class='task-item task-item--closed']//div[@class='task-checkbox no-nav']")
    public WebElement completedCheckmark;


    @FindBy(xpath = "(//li[@class='task-item']//button[@class='action-item action-item--single reactive no-nav undefined undefined has-tooltip'])[2]")
    public WebElement star;

    @FindBy(xpath = "//li[@class='app-navigation-entry list reactive router-link-exact-active active']/div/div[@class='action-item']")
    public WebElement threeDots;



    @FindBy(xpath = "(//div[@class='open']//li)[4]")
    public WebElement delete;






















    }

