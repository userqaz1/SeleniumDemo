package com.selen.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClickTest {
    @Test
    public void Click(){
        System.setProperty("webdriver.chrome.driver","D:\\Project\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.baidu.com");
        WebElement we=driver.findElement(By.id("su"));
        //右键点击
        Actions actions = new Actions(driver);
        actions.contextClick(we).perform();
    }
}
