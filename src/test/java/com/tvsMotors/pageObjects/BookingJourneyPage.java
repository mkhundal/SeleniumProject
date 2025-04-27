package com.tvsMotors.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingJourneyPage
{
    WebDriver driver;

    @FindBy(xpath = "//a[@id='left-tabs-example-tab-DRUM SXC']")
    WebElement vehicleModel;

    @FindBy(xpath = "//button[text()='Next']")
    WebElement clickNextButton;

    @FindBy(xpath = "//button[text()='Back']")
    WebElement clickBackButton;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(WebElement vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public WebElement getClickNextButton() {
        return clickNextButton;
    }

    public void setClickNextButton(WebElement clickNextButton) {
        this.clickNextButton = clickNextButton;
    }

    public WebElement getClickBackButton() {
        return clickBackButton;
    }

    public void setClickBackButton(WebElement clickBackButton) {
        this.clickBackButton = clickBackButton;
    }

    public BookingJourneyPage(WebDriver driver) {
        this.driver = driver;
    }
}
