package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test1.SeleniumBrowser;
//继承SeleniumBrowser的driver
public class WebdriverElement extends SeleniumBrowser {
    //封装By类型的查找元素的方法
    public static WebElement findElement(final By by) {
        //把元素等待加进来
      try {
          WebDriverWait w = new WebDriverWait(driver, 10);
          w.until(ExpectedConditions.presenceOfElementLocated(by));
      }catch (Exception e){
      System.out.println("元素"+by+"查找超时");
     e.printStackTrace();
      }
   return  driver.findElement(by);

    }
}

