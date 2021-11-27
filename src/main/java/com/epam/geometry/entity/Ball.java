package com.epam.geometry.entity;

public class Ball {

    private Point center;
    private double radius;

    public Ball (){
        center = new Point();
        radius = 0;
    }

    public Ball(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
