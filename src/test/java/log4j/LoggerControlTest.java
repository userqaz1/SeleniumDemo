package log4j;

import org.testng.annotations.Test;


public class LoggerControlTest {
    final  static  LoggerControler log=LoggerControler.getlogger(LoggerControlTest.class);

    @Test
    public void testcase(){
        log.debug("这是debug");
        log.info("这是info");
        log.warn("这是warn");
        log.error("这是error");

    }
}
