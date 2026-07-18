package com.cognizant.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingApplication {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingApplication.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        logger.debug("Debug Message");

        logger.warn("Warning Message");

        logger.error("Error Message");
    }
}