package com.epam.geometry.logic;

import com.epam.geometry.entity.Ball;
import com.epam.geometry.entity.Point;

public class BallCreator {

    private static final String SPLITTER = " ";

    private String pathname;

    public Ball createBall(String line){
        String[] splitLines = line.split(SPLITTER);
        double radius = Double.parseDouble(splitLines[0]);
        double valueX = Double.parseDouble(splitLines[1]);
        double valueY = Double.parseDouble(splitLines[2]);
        double valueZ = Double.parseDouble(splitLines[3]);
        return new Ball (radius, new Point(valueX, valueY, valueZ));

    }



}




