package com.epam.geometry.logic;

import com.epam.geometry.entity.Axis;
import com.epam.geometry.entity.Ball;
import com.epam.geometry.entity.Point;

public class Calculator {

    private double distance;

    public double calculateArea(Ball ball){
        private double area;
        area = 4 * Math.PI * Math.pow(ball.getRadius(), 2);
        return area;

    }

    public double calculateVolume(Ball ball){
        private double volume;
        volume = 4 / 3 * Math.PI * Math.pow(ball.getRadius(), 3);
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
    }

    public boolean isCross(Ball ball, Axis axis){
        Point center = ball.getCenter();
        double distance = calculateDistance(axis, center);
        double radius = ball.getRadius();
        return Math.abs(distance) <= radius;

    }

    public double calculateRatioOfValues(Ball ball, Axis axis){
        if (isCross(ball, axis)!= 0) {
            Point center = ball.getCenter();
            double radius = ball.getRadius();
            double heightOne = Math.abs(axis) - radius;
            double heightTwo = radius - Math.abs(axis);
            double heightOneAbs = Math.abs(heightOne);
            double heightTwoAbs = Math.abs(heightTwo);
            double valueOne = heightOneAbs * heightOneAbs * Math.PI / 3 * (3 * ball.getRadius() - heightOneAbs);
            double valueTwo = heightTwoAbs * heightTwoAbs * Math.PI / 3 * (3 * ball.getRadius() - heightTwoAbs);
        } else {
            return 0;
        }

   }
}
