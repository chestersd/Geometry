package com.epam.geometry.repository;

import com.epam.geometry.logic.Calculator;
import com.epam.geometry.logic.DataException;
import com.epam.geometry.observer.BallIdentifiable;

public class AreaSpecification implements Specification {
    private final double minimalArea;
    private final double maximalArea;
    private final Calculator calculator = new Calculator();

    public AreaSpecification(double minimalArea, double maximalArea) {
        this.minimalArea = minimalArea;
        this.maximalArea = maximalArea;
    }

    @Override
    public boolean specified(BallIdentifiable ball) throws DataException {
        double area = calculator.calculateArea(ball);
        return area >= minimalArea && area <= maximalArea;
    }
}
