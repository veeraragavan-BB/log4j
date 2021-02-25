import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;

public class DemoA {

    private static Logger log = LogManager.getLogger(DemoA.class.getName());
    public static void main(String[] args) {
        log.trace("I am trace");
        log.error("error");
        log.info("info");
        log.fatal("Show stopper");

    }
}
