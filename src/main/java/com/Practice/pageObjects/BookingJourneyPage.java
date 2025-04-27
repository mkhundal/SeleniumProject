package com.Practice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingJourneyPage
{
    WebDriver driver;



    @FindBy(xpath = "//button[text()='Next']")
    WebElement clickNextButton;

    @FindBy(xpath = "//button[text()='Back']")
    WebElement clickBackButton;

    @FindBy(xpath = "//input[@id='mobile-number'])[1]")
    WebElement location;

    @FindBy(xpath = "//div[text()='Dwarka,New Delhi']")
    WebElement selectLocation;

    @FindBy(xpath = "(//input[@id='mobile-number'])[2]")
    WebElement mobileNumber;

    @FindBy(xpath = "//label[text()='Mobile Number']/following-sibling::input")
    WebElement mobileNumberValidationError;

    @FindBy(xpath = "//input[@id='checkbox-input']")
    WebElement updatesCheckBox;

    @FindBy(xpath = "//input[@name='name']")
    WebElement fullName;

    @FindBy(xpath = "//label[text()='Full Name']/following-sibling::span")
    WebElement fullNameValidationErrorMessage;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailId;

    @FindBy(xpath = "//label[text()='Email ID']/following-sibling::span")
    WebElement emailValidationErrorMessage;

    @FindBy(xpath = "//input[@id='checkbox-input-privacy']")
    WebElement privacyOTPCheckBox;

    @FindBy(xpath = "//button[text()='Verify Mobile Number']")
    WebElement verifyMobileNumberButton;

    public BookingJourneyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebDriver getDriver() {
        return driver;
    }


    public WebElement getClickNextButton() {
        return clickNextButton;
    }

    public WebElement getClickBackButton() {
        return clickBackButton;
    }

    public WebElement getLocation() {
        return location;
    }

    public WebElement getSelectLocation() {
        return selectLocation;
    }

    public WebElement getMobileNumber() {
        return mobileNumber;
    }

    public WebElement getMobileNumberValidationError() {
        return mobileNumberValidationError;
    }

    public WebElement getUpdatesCheckBox() {
        return updatesCheckBox;
    }

    public WebElement getFullName() {
        return fullName;
    }

    public WebElement getFullNameValidationErrorMessage() {
        return fullNameValidationErrorMessage;
    }

    public WebElement getEmailId() {
        return emailId;
    }

    public WebElement getEmailValidationErrorMessage() {
        return emailValidationErrorMessage;
    }

    public WebElement getPrivacyOTPCheckBox() {
        return privacyOTPCheckBox;
    }

    public WebElement getVerifyMobileNumberButton() {
        return verifyMobileNumberButton;
    }
}
