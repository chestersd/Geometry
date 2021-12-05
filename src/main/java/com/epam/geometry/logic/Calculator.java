package com.epam.geometry.logic;

import com.epam.geometry.entity.Axis;
import com.epam.geometry.entity.Ball;
import com.epam.geometry.entity.Point;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Calculator {

    private static final Logger LOGGER = LogManager.getLogger(Calculator.class);

    private double distance;

    public static double calculateArea(Ball ball){
        LOGGER.info("Start calculating of the area " + ball.toString());
        double area;
        area = 4.0 * Math.PI * Math.pow(ball.getRadius(), 2.0);
        LOGGER.info("Calculate the area of " + ball + ": " + area);
        return area;

    }

    public double calculateVolume(Ball ball){
        LOGGER.info("Start calculating of the volume " + ball.toString());
        double volume;
        volume = 4.0 / 3.0 * Math.PI * Math.pow(ball.getRadius(), 3.0);
        LOGGER.info("Calculate the volume of " + ball + ": " + volume);
        return volume;

    }

    public double calculateDistance(Axis axis, Point center){
        LOGGER.info("Start calculating of the distance " + axis.toString());
        switch (axis) {
            case XY:
                return center.getValueZ();
            case XZ:
                return center.getValueY();
            case ZY:
                return center.getValueX();
        }
        LOGGER.info("Calculate the distance of " + axis + ": " + distance);
        return distance;
    }

    public boolean isCross(Ball ball, Axis axis){
        LOGGER.info("Start defining of the crossing " + ball.toString());
        Point center = ball.getCenter();
        double distance = calculateDistance(axis, center);
        double radius = ball.getRadius();
        LOGGER.info("Defined the crossing of " + ball + ": " + axis);
        boolean isCross = Math.abs(distance) <= radius;
        return isCross;
    }

    public double calculateRatioOfVolume(Ball ball, Point point, Axis axis){
        LOGGER.info("Start calculating of the ratio " + ball.toString());
        Point center = ball.getCenter();
        double distance = calculateDistance(axis, center);
        double radius = ball.getRadius();
        double height = radius - distance;
        double valueOfFirstSegment = Math.pow(height, 2.0) * Math.PI / 3.0 * (3.0 * radius - height);
        double valueOfSecondSegment = calculateVolume(ball) - valueOfFirstSegment;
        double ratio = valueOfFirstSegment / valueOfSecondSegment;
        LOGGER.info("Calculate the ratio of " + ball + ": " + ratio);
        return ratio;
   }
}
