package com.selen.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class ChromeTest {
    @Test
    public void Chrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Project\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.baidu.com");
    }
    @Test
    public  void FirefoxTest(){
        System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.baidu.com");
    }
    //下载的17134暂时不可用
//    @Test
//    public  void MicrosoftTest(){
//        System.setProperty("webdriver.edge.driver","D:\\Project\\driver\\MicrosoftWebDriver.exe");
//        WebDriver driver=new EdgeDriver();
//        driver.get("https://www.baidu.com");
//    }

}
