

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-07-27 14:17
 */
public class TestMain {
    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(   TestMain.class );
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }
}
