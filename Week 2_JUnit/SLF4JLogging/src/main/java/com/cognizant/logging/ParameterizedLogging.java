package com.cognizant.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String name = "Indu";
        int age = 21;

        logger.info("Name: {}, Age: {}", name, age);

        logger.debug("User {} logged in", name);
    }
}