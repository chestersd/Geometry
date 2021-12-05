package com.epam.geometry.logic;

import com.epam.geometry.entity.Ball;
import com.epam.geometry.entity.Point;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class BallCreator {

    private static final Logger LOGGER = LogManager.getLogger(BallCreator.class);

    private static final String SPLITTER = " ";

    public Ball createBall(String line){
        LOGGER.info("Start of creating a ball");
        String[] splitLines = line.split(SPLITTER);
        double radius = Double.parseDouble(splitLines[0]);
        double valueX = Double.parseDouble(splitLines[1]);
        double valueY = Double.parseDouble(splitLines[2]);
        double valueZ = Double.parseDouble(splitLines[3]);
        Point point = new Point();
        Ball createdBall = new Ball(radius, point);
        return createdBall;
    }
}




