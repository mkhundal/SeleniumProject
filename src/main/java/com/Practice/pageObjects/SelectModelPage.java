package com.Practice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectModelPage
{
    WebDriver driver;

    @FindBy(xpath = "//a[@id='left-tabs-example-tab-DRUM SXC']")
    WebElement vehicleModel;

    public SelectModelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getVehicleModel() {
        return vehicleModel;
    }
}
