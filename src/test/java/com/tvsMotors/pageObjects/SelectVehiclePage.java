package com.tvsMotors.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectVehiclePage
{
    WebDriver driver;

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

}
