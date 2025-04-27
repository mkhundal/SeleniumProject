package com.Practice.PageActions;

import com.Practice.pageObjects.BookOnlinePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookOnlinePageActions {
    WebDriver driver;
    BookOnlinePage bookOnlinePage;


    public BookOnlinePageActions(WebDriver driver) {
        this.bookOnlinePage = new BookOnlinePage(driver);
        this.driver=driver;
    }

    public void selectVehicle()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        wait.until(ExpectedConditions.elementToBeClickable(bookOnlinePage.getMotorLink()));
        js.executeScript("window.scrollBy(0,arguments[0].getBoundingClientRect().top-window.innerHeight/2);",bookOnlinePage.getMotorLink());
        bookOnlinePage.getMotorLink().click();
    }

}
