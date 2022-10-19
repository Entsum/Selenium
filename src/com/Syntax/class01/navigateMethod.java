package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {

        //go to google.com
        //go to facebook.com
        //go back to google.com

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        //create the webDriver instance
        WebDriver driver = new ChromeDriver();

        //go to google.com
        driver.get("https://www.google.com/");

        //introduce some sleep which is wait
        //wait or pause for 2000ms or (2sec)
        Thread.sleep(2000);

        //go to fb.com
        driver.navigate().to("https://www.facebook.com/");

        //introduce some sleep which is wait
        //wait or pause for 2000ms or (2sec)
        Thread.sleep(2000);

        //go back to google.com
        driver.navigate().back();

        //introduce some sleep which is wait
        //wait or pause for 2000ms or (2sec)
        Thread.sleep(2000);

        //go ack to fb.com
        driver.navigate().forward();

        //introduce some sleep which is wait
        //wait or pause for 2000ms or (2sec)
        Thread.sleep(2000);

        //refresh the page
        driver.navigate().refresh();

        //quit the application
        driver.quit();

    }
}
