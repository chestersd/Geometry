package com.epam.geometry.logic;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.regex.Pattern;

public class BallValidator {

    private static final Logger LOGGER = LogManager.getLogger(BallValidator.class);

    private static final String BALL_LINE_REGEX = "\\d+\\.\\d+( (-)?\\d+\\.\\d+){3}";

    public boolean isBall(String line) {
        LOGGER.info("Start defining of a validity... ");
        return Pattern.matches(BALL_LINE_REGEX, line);
    }
}



