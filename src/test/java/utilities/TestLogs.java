package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Date;

public class TestLogs {

    public static Logger log = Logger.getLogger(TestLogs.class.getName());
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.setProperty("current.date", d.toString().replace(" ", "_").replace(":", "_"));
        PropertyConfigurator.configure("src/test/resources/properties/log4j.properties");
        log.info("This is information log");
        log.error("Here the error logs will be printed");
    }
}
