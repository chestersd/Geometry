package com.epam.geometry.logic;

import com.epam.geometry.entity.Ball;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Director {

    private BallReader reader;
    private BallValidator validator;
    private BallCreator creator;
    private static final Logger LOGGER = LogManager.getLogger(Director.class);

    public Director(BallReader reader, BallValidator validator, BallCreator  creator){
        this.reader = reader;
        this.validator = validator;
        this.creator = creator;
    }

    public List<Ball> read(String path) {
        LOGGER.info("Started reading balls from file: " + path);
        List<Ball> balls = new ArrayList<>();
        try {
            for (String line : reader.read(path)) {
                if (validator.isBall(line)) {
                    Ball ball = creator.createBall(line);
                    balls.add(ball);
                }
            }
        } catch (DataException e) {
            LOGGER.error("Caught " + e);
        }
        return balls;
    }
}
