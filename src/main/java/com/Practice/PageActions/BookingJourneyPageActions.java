package com.Practice.PageActions;

import com.Practice.pageObjects.BookingJourneyPage;
import com.Practice.pageObjects.SelectModelPage;
import org.openqa.selenium.WebDriver;

public class BookingJourneyPageActions {
    WebDriver driver;
    BookingJourneyPage bookingJourneyPage;

    public BookingJourneyPageActions(WebDriver driver) {
        this.bookingJourneyPage = new BookingJourneyPage(driver);
    }

    public void selectDealership()
    {
        bookingJourneyPage.getLocation().sendKeys("Delhi");
        bookingJourneyPage.getSelectLocation().click();
    }
    public void enterPersonalInformation()
    {
        bookingJourneyPage.getMobileNumber().sendKeys("123");

        String mobileNumberErrorMessage=bookingJourneyPage.getMobileNumberValidationError().getText();
        System.out.println("Mobile number error is: "+mobileNumberErrorMessage);

        bookingJourneyPage.getFullName().sendKeys("Mandeep");
        String fullNameErrorMessage=bookingJourneyPage.getFullNameValidationErrorMessage().getText();
        System.out.println("Full name error is: "+fullNameErrorMessage);

        bookingJourneyPage.getEmailId().sendKeys("mk.gmail.com");
        String emailErrormessage=bookingJourneyPage.getEmailValidationErrorMessage().getText();
        System.out.println("Email error mesasge is: "+emailErrormessage);

    }
    public void acceptTermsAndConditionsAndVerifyMobile()
    {
        bookingJourneyPage.getPrivacyOTPCheckBox().click();
        bookingJourneyPage.getVerifyMobileNumberButton().click();
    }


}
