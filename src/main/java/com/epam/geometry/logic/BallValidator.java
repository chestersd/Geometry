package com.epam.geometry.logic;

//import com.epam.geometry.entity.Ball;
//import com.epam.geometry.entity.Point;
import java.util.regex.Pattern;

public class BallValidator {

    private static final String BALL_LINE_REGEX = "\\d+\\.\\d+( (-)?\\d+\\.\\d+){3}";

    public boolean isBall(String line) {
        return Pattern.matches(BALL_LINE_REGEX, line);
    }
}
//    https://proselyte.net/tutorials/java-core/regular-expressions/



