package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {

        //st the path to the driver to link it to a class
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
       //create Webdriver
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        driver.manage().window().maximize();

        WebElement checkbox=driver.findElement(By.id("is selected"));

        checkbox.click();
    }
}
