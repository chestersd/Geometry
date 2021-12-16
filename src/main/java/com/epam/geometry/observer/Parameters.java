package com.epam.geometry.observer;

public class Parameters {

    private final double area;
    private final double volume;

    public Parameters(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
}
