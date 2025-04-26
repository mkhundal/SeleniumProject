package com.Practice.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        System.out.println(driver.getTitle());

        driver.manage().window().maximize();

        WebElement signupButton = driver.findElement(By.partialLinkText("new account"));
        signupButton.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));

       // WebElement firstName = driver.findElement(By.name("firstName"));
               firstName.sendKeys("Mandeep");
       // firstName.clear();

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
               lastName.sendKeys("Kaur");
       // lastName.clear();

        WebElement monthDD = driver.findElement(By.id("month"));
        Select monthSelect = new Select(monthDD);
        monthSelect.selectByVisibleText("May");
        List<WebElement> monthOptions  = monthSelect.getOptions();
        for(WebElement option: monthOptions)
        {
            System.out.println("Test is : " + option.getText());
        }

        WebElement firstOption = monthSelect.getFirstSelectedOption();
        System.out.println("First seleted option is : "+firstOption.getText());

        Select dayDD = new Select(driver.findElement(By.id("day")));
        dayDD.selectByValue("5");

        Select yearDD = new Select(driver.findElement(By.id("year")));
        yearDD.selectByVisibleText("1990");

        WebElement femaleRadio = driver.findElement(By.xpath("//label[text()='Female']/input[@value='1']"));
       // WebElement femaleRadio = driver.findElement(By.xpath("//label/input[@value='1']"));
        femaleRadio.click();
        System.out.println("Female selected or not : "+femaleRadio.isSelected());
        System.out.println("Text is : "+ femaleRadio.getText());

        WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/input[@value='2']"));
        System.out.println("Male radio is selected or not : "+maleRadio.isSelected());

        WebElement customRadio = driver.findElement(By.xpath("//label/input[@value='-1']"));
        System.out.println("Custom radio is selected or not : "+customRadio.isSelected());

//        WebElement pronoun = driver.findElement(By.id("preferred_pronoun"));
//        Select pronounOption = new Select(pronoun);
//        pronounOption.selectByVisibleText("Select your pronoun");
//        System.out.println("First pronoun option is : "+pronounOption.getFirstSelectedOption());

        WebElement email = driver.findElement(By.xpath("//div[text()='Mobile number or email']/following-sibling::input"));
        email.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.xpath("//div[text()='New password']/input[@id='password_step_input']"));
        password.sendKeys("abc@gmail.com");

        WebElement button = driver.findElement(By.name("websubmit"));
        button.submit();
        System.out.println("Button text : "+button.getText());







        driver.quit();
    }
}
