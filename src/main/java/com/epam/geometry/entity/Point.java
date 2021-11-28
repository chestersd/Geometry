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

    public void setValueX(double valueX) {
        this.valueX = valueX;
    }

    public double getValueY() {
        return valueY;
    }

    public void setValueY(double valueY) {
        this.valueY = valueY;
    }

    public double getValueZ() {
        return valueZ;
    }

    public void setValueZ(double valueZ) {
        this.valueZ = valueZ;
    }



}
