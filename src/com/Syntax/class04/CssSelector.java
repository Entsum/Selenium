package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

            //        goto syntaxProject.com simple-form-demo
            driver.get("https://syntaxprojects.com/basic-first-form-demo.php");


            //        get the webElment text box
      driver.findElement(By.cssSelector("input[placeholder *='Please enter']")).sendKeys("Abracadbara");


           //        another method of doing the above operation
                    WebElement textBox = driver.findElement(By.cssSelector("input[placeholder= 'Please enter']"));
            textBox.sendKeys("Abracadbra");

            //        press the button show message
            WebElement button = driver.findElement(By.cssSelector("button[onclick ^='showIn']"));
            button.click();

        }
}
