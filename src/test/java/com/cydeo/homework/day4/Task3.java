package com.cydeo.homework.day4;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task3 {
    public static void main(String[] args) {
        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //3. Click on Button 1
        WebElement clickButton = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        clickButton.click();

        //4. Verify text displayed is as expected: Expected: “Clicked on button one!”
        WebElement textResult = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedResult = "Clicked on button one!";
        String actualResult = textResult.getText();
        if(actualResult.equals(expectedResult)){
            System.out.println("Text displayed as expected");
        }else{
            System.out.println("Text displayed as NOT expected");
        }
    }
}
