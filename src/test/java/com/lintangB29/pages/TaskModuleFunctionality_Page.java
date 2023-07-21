package com.lintangB29.pages;

import com.lintangB29.utilities.Driver;
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

    @FindBy(xpath = "//li[@class='app-navigation-entry list reactive']")
    public List<WebElement> allList;

    public static List<WebElement>listOfAllTasksWebElements(){
        List<WebElement> allTasksWebElements = Driver.getDriver().findElements(By.xpath("//li[@class='app-navigation-entry list reactive']"));
        return allTasksWebElements;
    }

    public static List<String> listOfALlTasksString(){

        List<String> textOfAllTasks = new ArrayList<>();

        for (WebElement tasks : listOfAllTasksWebElements()) {
            textOfAllTasks.add(tasks.getText());
        }

        return textOfAllTasks;
    }

    }

