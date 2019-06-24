package test1;

import log4j.LoggerControler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.Logger;

public class SeleniumBrowser {


    public static WebDriver driver;
    final  static  LoggerControler log=LoggerControler.getlogger(SeleniumBrowser.class);
    //private static Logger logger = Logger.getLogger(SeleniumBrowser.class);

    public static WebDriver open(String browser) {
//
//      System.setProperty("webdriver.chrome.driver","D:\\Project\\driver\\chromedriver.exe");
//      WebDriver driver=new ChromeDriver();
       //  String  path=System.getProperty("dir");//返回null
        String  path=System.getProperty("user.dir");//返回D:\Project
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",path+"/driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.chrome.driver",path+"/driver/firefox.exe");
            driver = new FirefoxDriver();
        }else{
            //System.err.println("传入的信息有误"+browser);
           log.info("传入的信息有误");
        }
        return driver;
    }
    public static void close(){

        driver.quit();
    }
}