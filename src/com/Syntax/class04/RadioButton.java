package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        goto syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
//        get the radio button Male
                WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
//        check if the radio btn is displayed
        boolean displayStatus = maleRadioBtn.isDisplayed();
//        print the display status
        System.out.println("The radio button is Displayed :"+displayStatus);

//        check weather the radio button male is Enabled
        boolean enableStatus = maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled :"+enableStatus);

//        check weather the radio button male is selcted
        boolean selectStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button is selected :"+selectStatus);

//check if the radio button male is not selected then click on it
        if(!selectStatus){
//            perfrom a click operation on the radio button
            maleRadioBtn.click();
        }
        selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is selected :"+selectStatus);






    }
}
