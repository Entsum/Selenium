package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //maximize window
        driver.manage().window().maximize();

        //enter username
        //1. locate the element and send the keys
        driver.findElement(By.id("email")).sendKeys("Asghar");

        //enter the password in the textBox
        driver.findElement(By.name("pass")).sendKeys("Easy");

        //click the login
        driver.findElement(By.name("login")).click();

        //task 2
        //click on forgot password using linkLocator
       // driver.findElement(By.linkText("Forgot password?")).click();

        //for the following task please make sure to comment task2 for login functionality

        //task 3
        //driver.findElement(By.partialLinkText("Forgot")).click();

    }
}
