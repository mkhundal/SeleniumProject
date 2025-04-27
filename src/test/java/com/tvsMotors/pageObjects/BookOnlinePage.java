package com.tvsMotors.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookOnlinePage
{
    WebDriver driver;

    @FindBy(xpath = "//a[@href='https://www.tvsmotor.com/book-online']")
    WebElement bookVehicleOnline;

    @FindBy(xpath = "(//div[text()='TVS Jupiter'])[1]")
    WebElement motorLink;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBookVehicleOnline() {
        return bookVehicleOnline;
    }

    public void setBookVehicleOnline(WebElement bookVehicleOnline) {
        this.bookVehicleOnline = bookVehicleOnline;
    }

    public BookOnlinePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMotorLink() {
        return motorLink;
    }

    public void setMotorLink(WebElement motorLink) {
        this.motorLink = motorLink;
    }
}
