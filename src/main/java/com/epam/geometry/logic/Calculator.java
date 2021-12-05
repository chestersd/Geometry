package com.epam.geometry.logic;

import com.epam.geometry.entity.Axis;
import com.epam.geometry.entity.Ball;
import com.epam.geometry.entity.Point;

public class Calculator {

    private double distance;

    public static double calculateArea(Ball ball){
        double area;
        area = 4.0 * Math.PI * Math.pow(ball.getRadius(), 2.0);
        return area;

    }

    public double calculateVolume(Ball ball){
        double volume;
        volume = 4.0 / 3.0 * Math.PI * Math.pow(ball.getRadius(), 3.0);
        return volume;

    }

    public double calculateDistance(Axis axis, Point center){
        switch (axis) {
            case XY:
                return center.getValueZ();
            case XZ:
                return center.getValueY();
            case ZY:
                return center.getValueX();
        }
        return distance;
    }

    public boolean isCross(Ball ball, Axis axis){
        Point center = ball.getCenter();
        double distance = calculateDistance(axis, center);
        double radius = ball.getRadius();
        return Math.abs(distance) <= radius;
    }

    public double calculateRatioOfVolume(Ball ball, Point point, Axis axis){
        Point center = ball.getCenter();
        double distance = calculateDistance(axis, center);
        double radius = ball.getRadius();
        double height = radius - distance;
        double valueOfFirstSegment = Math.pow(height, 2.0) * Math.PI / 3.0 * (3.0 * radius - height);
        double valueOfSecondSegment = calculateVolume(ball) - valueOfFirstSegment;
        return valueOfFirstSegment / valueOfSecondSegment;
   }
}
