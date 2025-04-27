package com.Practice.PageActions;

import com.Practice.pageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageActions
{
    WebDriver driver;
    HomePage homePage;

    public HomePageActions(WebDriver driver) {
        this.homePage = new HomePage(driver);
    }



    public void navigateToBuyVehiclePage()
    {

        homePage.getBuyVehicle().click();
    }



}
