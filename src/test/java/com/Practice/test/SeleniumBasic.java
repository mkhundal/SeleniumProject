package com.Practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class SeleniumBasic
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);

       // driver.findElement(By.id("navbtn_tutorials")).click();
       // driver.findElement(By.id("filter-tutorials-input")).sendKeys("JavaScript");
      //  driver.findElement(By.className("w3-bar-item")).click();

        driver.findElement(By.id("search2")).sendKeys("Java");
        driver.findElement(By.id("learntocode_searchbtn")).click();
       // driver.findElement(By.id("listofsearchresults")).click();

       driver.findElement(By.className("w3-right")).click();
        driver.findElement(By.partialLinkText("Next")).click();
       // List<WebElement> links = driver.findElements(By.tagName("a"));

       // System.out.println("Total Links : "+ links.size());

       // driver.findElement(By.tagName("JS Introduction")).click();

        driver.findElement(By.className("ga-nav")).click();

}

}