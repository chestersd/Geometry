package com.epam.geometry.entity;

public class Point {

    private double valueX;
    private double valueY;
    private double valueZ;

    public Point(){
    valueX = 0;
    valueY = 0;
    valueZ = 0;
    }

    public Point(double valueX, double valueY, double valueZ) {
        this.valueX = valueX;
        this.valueY = valueY;
        this.valueZ = valueZ;
    }

    public double getValueX() {
        return valueX;
    }

    public double getValueY() {
        return valueY;
    }

    public double getValueZ() {
        return valueZ;
    }
}
