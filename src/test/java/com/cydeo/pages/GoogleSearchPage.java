package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//textarea[@jsname='yZiJbe']")
    public WebElement textBox;

    @FindBy(xpath = "(//input[@class='gNO89b'])[2]")
    public WebElement searchButton;

}
