package patika.practicum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;




/**
 * Log4jDemo
 */
public class Log4jDemo {

    static Logger logger = LogManager.getLogger(Log4jDemo.class);


    public static void main(String[] args) {
        System.out.println("\nHello World...!\n");

        logger.trace("This is a trace message");
        logger.info("This is an information message");
        logger.error("This is an error message");
        logger.warn("This is a warning message");
        logger.fatal("This is a fatal message");

        System.out.println("\nCompleted");
    }
}