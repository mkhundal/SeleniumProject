package com.Practice.PageActions;

import com.Practice.pageObjects.SelectModelPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectModelPageActions
{
    WebDriver driver;
    SelectModelPage selectModelPage;

    public SelectModelPageActions(WebDriver driver)
    {
        this.selectModelPage = new SelectModelPage(driver);

    }

    public void selectVehicleModel()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(selectModelPage.getVehicleModel()));
        selectModelPage.getVehicleModel().click();

    }


}
