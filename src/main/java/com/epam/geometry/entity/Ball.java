package com.epam.geometry.entity;

public class Ball {

    private double radius;
    private Point center;

//    public Ball(int i){
//        radius = 0;
//        center = new Point();
//    }

    public Ball(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

//    public Ball(Point point, double radius) {
//    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return this.radius;
    }

}
