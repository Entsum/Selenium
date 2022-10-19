package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) throws InterruptedException {

        // go to google.com
        //maximize your window

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //use the get() function to open up the required website
        driver.get("https://www.google.com/");

        //maximize
        driver.manage().window().maximize();

        // fullscreen
        driver.manage().window().fullscreen();

        Thread.sleep(2000);

        driver.quit();
    }

}
