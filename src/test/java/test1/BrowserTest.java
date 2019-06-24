package test1;

import org.testng.annotations.Test;

public class BrowserTest {
    @Test
    //调用SeleniumBrowser类中的方法
    public void open(){
       SeleniumBrowser.open ("firefox2");
        // SeleniumBrowser.open ("chrome");
        SeleniumBrowser.close();
    }

}
