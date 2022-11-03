package com.Syntax.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Taras");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Hulyar");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("Selenium@selenium.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Selenium@selenium.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Java123");
        Thread.sleep(1000);
        driver.findElement(By.id("month")).sendKeys("January");
        Thread.sleep(1000);
        driver.findElement(By.id("day")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.id("year")).sendKeys("1992");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
