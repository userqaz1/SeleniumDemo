package log4j;


import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public  class LoggerControler{
    //注意是log4j下的logger，导包不要导错//java.util.logging
     private static Logger logger =null;
    private  static  LoggerControler logg=null;


    public static LoggerControler  getlogger (Class<?> T){
       if(logger==null) {
           //实例化这个类，用该类的方法处理log4j文件（即格式为.properties）
           Properties pro = new Properties();
           try {
               String path = System.getProperty("user.dir");
               String filepath = path + "/config/log4j.properties";
               //找到该文件读取该文件内容
               InputStream is = new FileInputStream(filepath);
               pro.load(is);
           } catch (IOException e) {
               e.printStackTrace();
           }
          // log4j下的方法
           PropertyConfigurator.configure(pro);
                  logger= Logger.getLogger(T);
                  logg=new LoggerControler();
       }
       return   logg;
    }
    public void debug (String msg){

        logger.debug(msg);
    }
    public void info (String msg){
        logger.info(msg);
    }
    public void warn (String msg){
      logger.warn(msg);
    }
    public void error (String msg){
        logger.error(msg);
    }
}
