package com.Practice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuoteForm
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/insurance/v1/header.php");
        System.out.println("The current url: "+driver.getCurrentUrl());


    }
}
