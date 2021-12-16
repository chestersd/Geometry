package com.epam.geometry.entity;

import java.util.Objects;

public class Ball {

    private double radius;
    private Point center;

    public Ball(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.radius, radius) == 0 && Objects.equals(center, ball.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, center);
    }
}
