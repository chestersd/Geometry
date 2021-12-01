package com.epam.geometry.entity;

public class Ball {

    private Point center;
    private double radius;

    public Ball(int i){
        center = new Point();
        radius = 0;
    }

    public Ball(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Ball(double radius, Point point) {
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
