package com.epam.geometry.repository;

import com.epam.geometry.logic.Calculator;
import com.epam.geometry.logic.DataException;
import com.epam.geometry.observer.BallIdentifiable;

public class VolumeSpecification {
    private final double minimalVolume;
    private final double maximalVolume;
    private final Calculator calculator = new Calculator();

    public AreaSpecification(double minimalVolume, double maximalVolume) {
        this.minimalVolume = minimalVolume;
        this.maximalVolume = maximalVolume;
    }

    @Override
    public boolean specified(BallIdentifiable ball) throws DataException {
        double area = calculator.calculateVolume(ball);
        return area >= minimalVolume && area <= maximalVolume;
    }
}
