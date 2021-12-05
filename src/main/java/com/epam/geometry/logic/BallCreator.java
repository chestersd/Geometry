package com.epam.geometry.logic;

import com.epam.geometry.entity.Ball;
import com.epam.geometry.entity.Point;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BallCreator {

    private static final Logger LOGGER = LogManager.

    private static final String SPLITTER = " ";

    public Ball createBall(String line){
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




