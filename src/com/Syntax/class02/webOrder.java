package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrder {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //maximize window
        driver.manage().window().maximize();

        //login
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        //password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        //click login
        driver.findElement(By.className("button")).click();

        //make sure that the title is correct (	Web Orders)

        //get the of the page
        String title = driver.getTitle();


        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The Title is correct: "+title);
        }
else System.out.println("The Title is incorrect: " + title);

    }
}
