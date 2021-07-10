package io.pragra.learning.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class DummyTest {
    private Logger logger = LogManager.getLogger(DummyTest.class);

    @Test
    public void tc(){
        logger.info("This is an info message by  {} ", "Atin");
        logger.debug("This is an DEBUG message by  {} ", "Atin");
        logger.trace("This is an TRACE message by  {} ", "Atin");
        logger.warn("This is an WARN message by  {} ", "Atin");
        logger.error("This is an ERROR message by  {} ", "Atin");
        logger.fatal("This is an FATAL message by  {} ", "Atin");
    }

}
