package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
//set path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//use the get() function to open up the required website
        driver.get("https://www.google.com/");
// get url of the website
        String url = driver.getCurrentUrl();
//print the url
        System.out.println(url);

//get the title
        String title = driver.getTitle();
//print title
        System.out.println(title);
//close the Chrome browser
        driver.quit();
    }
}
