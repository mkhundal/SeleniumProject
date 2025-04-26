package com.Practice.test;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TVSTest
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tvsmotor.com/");

        System.out.println(driver.getTitle());

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement buyVehicleLink = driver.findElement(By.xpath("//a[@href='https://www.tvsmotor.com/book-online']"));
        buyVehicleLink.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        WebElement bookVehicle1 = driver.findElement(By.linkText("BOOK VEHICLE"));
//         wait.until(ExpectedConditions.visibilityOf(bookVehicle1));
      //   js.executeScript("window.scrollBy(0,800)");

       // WebElement bookVehicle = driver.findElement(By.xpath("a[@id='book-selection-tabs-tab-BOOK VEHICLE']"));




           // if(bookVehicle1.isSelected()) {
                // bookVehicle.click();
 /*               WebElement vehicleScooter = driver.findElement(By.xpath("//a[@id='book-selection-tabs-tab-Scooter']"));
        wait.until(ExpectedConditions.visibilityOf(vehicleScooter));
        js.executeScript("window.scrollBy(0,800)");
                vehicleScooter.click();*/
          //  }

            do {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }while(!(js.executeScript("return document.readyState").equals("complete")));


            WebElement motorLink = driver.findElement(By.xpath("(//div[text()='TVS Jupiter'])[1]"));
            wait.until(ExpectedConditions.elementToBeClickable(motorLink));
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,arguments[0].getBoundingClientRect().top-window.innerHeight/2);",motorLink);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            motorLink.click();

        do {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while(!(js.executeScript("return document.readyState").equals("complete")));

       // WebElement vehicleModel = driver.findElement(By.linkText("DRUM SXC"));
        WebElement vehicleModel = driver.findElement(By.xpath("//a[@id='left-tabs-example-tab-DRUM SXC']"));
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(vehicleModel));
        vehicleModel.click();

        WebElement drumSxc = driver.findElement(By.xpath("//button[text()='Next']"));
        drumSxc.click();

        WebElement location = driver.findElement(By.xpath("(//input[@id='mobile-number'])[1]"));
        location.sendKeys("Delhi");
        //location.findElement(By.linkText("Delhi,India"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement selectLocation = driver.findElement(By.xpath("//div[text()='Dwarka,New Delhi']"));
       // Actions actions = new Actions(driver);
       // actions.scrollToElement(selectLocation).click().perform();
       // actions.moveToElement(selectLocation).click();
        selectLocation.click();
        System.out.println("Location is selected");
        //location.click();

        //WebElement dealership = driver.findElement(By.xpath("//div[text()='TVS - Dynamic Motors Pvt Ltd'][1]"));
     //   WebElement dealership = driver.findElement(By.xpath("//div[text()='TVS - Dynamic Motors Pvt Ltd']/following::div[3]"));

        //Select citySelect = new Select(dealership);
       // citySelect.selectByVisibleText("TVS - Dynamic Motors Pvt Ltd");
      //  dealership.click();

        //taskkill /IM chrome.exe

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement dealershipMobile = driver.findElement(By.xpath("(//input[@id='mobile-number'])[2]"));
        dealershipMobile.sendKeys("123");
        dealershipMobile.findElement(By.xpath("//span[text()='Mobile Number should contain 10 characters.']"));
        System.out.println("Error displaying for Mobile Number: "+dealershipMobile.getText());

        WebElement updatesCheckBox = drumSxc.findElement(By.xpath("//input[@id='checkbox-input']"));
        updatesCheckBox.click();
        System.out.println("Updates checkbox is selected: "+updatesCheckBox.isSelected());

        WebElement fullName = driver.findElement(By.xpath("//input[@name='name']"));
        fullName.sendKeys("Neha");
        WebElement fullNameError= driver.findElement(By.xpath("//label[text()='Full Name']/following-sibling::span"));

        if(!fullNameError.getText().equalsIgnoreCase("Please enter both first and last name.")){
            System.out.println("Error displaying for Full Name is wrong: "+fullNameError.getText());
        }

        WebElement emailId = driver.findElement(By.xpath("//input[@name='email']"));
        emailId.sendKeys("mk.gmail.com");
       WebElement emailError =  emailId.findElement(By.xpath("//label[text()='Email ID']/following-sibling::span"));
        if(!emailError.getText().equalsIgnoreCase("Please enter valid email.")){
            System.out.println("Error displaying for Email is wrong: "+emailError.getText());
        }


        WebElement privacyCheck = driver.findElement(By.xpath("//input[@id='checkbox-input-privacy']"));
        System.out.println("Is CheckBox selected : "+privacyCheck.isSelected());
        privacyCheck.click();
        System.out.println("Is CheckBox selected : "+privacyCheck.isSelected());

        WebElement verifyButton = driver.findElement(By.xpath("//button[text()='Verify Mobile Number']"));
        verifyButton.click();



        driver.close();




    }
}
