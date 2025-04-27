package com.Practice.test;

import com.Practice.PageActions.BookOnlinePageActions;
import com.Practice.PageActions.BookingJourneyPageActions;
import com.Practice.PageActions.HomePageActions;
import com.Practice.PageActions.SelectModelPageActions;
import com.Practice.pageObjects.BookingJourneyPage;
import com.Practice.pageObjects.SelectModelPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookVehicleTest
{
      @Test
      public void bookVehicleTest()
      {
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.tvsmotor.com/");
          System.out.println(driver.getTitle());
          driver.manage().window().maximize();

          HomePageActions homePageActions = new HomePageActions(driver);
          homePageActions.navigateToBuyVehiclePage();

          BookOnlinePageActions bookOnlinePageActions =  new BookOnlinePageActions(driver);
          bookOnlinePageActions.selectVehicle();

          SelectModelPageActions selectModelPageActions = new SelectModelPageActions(driver);
          selectModelPageActions.selectVehicleModel();

          BookingJourneyPageActions bookingJourneyPageActions = new BookingJourneyPageActions(driver);
          bookingJourneyPageActions.selectDealership();
          bookingJourneyPageActions.enterPersonalInformation();
          bookingJourneyPageActions.acceptTermsAndConditionsAndVerifyMobile();


      }

}
