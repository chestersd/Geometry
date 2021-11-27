package com.epam.geometry.logic;

import com.epam.geometry.entity.Ball;

public class Calculator {

    private double area;
    private double volume;

    public double calculateArea(Ball ball){
        area = 4 * Math.PI * Math.pow(ball.getRadius(), 2);
        return area;

    }

    public double calculateVolume(Ball ball){
        volume = 4 / 3 * Math.PI * Math.pow(ball.getRadius(), 3);
        return volume;

    }

    public boolean isTouch(){

    }

    public double calculateRatio(){

    }
}
