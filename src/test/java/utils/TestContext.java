package utils;


import org.apache.log4j.Logger;

public class TestContext extends TestBase{
    private static Logger log = Logger.getLogger(TestContext.class);

    public static void log(String msg){
        log.info(msg);

    }
}
