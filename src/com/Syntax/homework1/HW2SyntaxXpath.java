package com.Syntax.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2SyntaxXpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[starts-with(@class,'list')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[starts-with(@class,'form')]")).sendKeys("selenium");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
        Thread.sleep(2000);
        driver.quit();



    }
}
