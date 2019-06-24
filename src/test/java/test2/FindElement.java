package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test1.SeleniumBrowser;

import java.util.List;
import java.util.Set;

import static test1.SeleniumBrowser.driver;

public class FindElement {
    @Test
    public void find(){
        SeleniumBrowser.open("chrome");
        //import static test1.SeleniumBrowser.driver;（SeleniumBrowser里面的driver）
        driver.get("https://www.baidu.com");
        //调用WebdriverElement类的方法
        Boolean b=WebdriverElement.findElement(By.id("su")).isDisplayed();
        Assert.assertTrue(b);

    }
}
