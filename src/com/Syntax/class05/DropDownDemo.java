package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it to a class
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        //create Webdriver instance
        WebDriver driver = new ChromeDriver();
        //go to project
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");
        //maximize window
        driver.manage().window().maximize();

        //find the webElementdropDown by looking for select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));
        //        use Select class
        Select select =new Select(dropDown);

//        select an option by index
        select.selectByIndex(5);
        Thread.sleep(3000);
//select by visible text
        select.selectByVisibleText("Saturday");
        Thread.sleep(3000);
        //select by value
        select.selectByValue("Sunday");

        //select everything from dropdown
        List<WebElement> options = select.getOptions();

        //traverse through options
        for (int i =0; i<options.size(); i++){

            WebElement option = options.get(i);
            String text = option.getText();
            if (text.equalsIgnoreCase("Friday")){
                select.selectByIndex(i);
            }
        }

    }
}
