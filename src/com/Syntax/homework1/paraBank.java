package com.Syntax.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Taras");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.lastName")).sendKeys("Hulyar");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.street")).sendKeys("123 Selenium");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.city")).sendKeys("Java");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.state")).sendKeys("NY");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("1234567890");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.ssn")).sendKeys("2344225435");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.username")).sendKeys("Selenium");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.password")).sendKeys("IsGood");
        Thread.sleep(1000);
        driver.findElement(By.name("repeatedPassword")).sendKeys("IsGood");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
