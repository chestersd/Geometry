package com.epam.geometry.repository;

import com.epam.geometry.logic.DataException;
import com.epam.geometry.observer.BallIdentifiable;
import com.epam.geometry.observer.BallStore;

import java.util.Comparator;

import static java.util.Comparator.nullsLast;

public enum BallComparator {
    ID,
    AREA,
    VOLUME;

    public Comparator<BallIdentifiable> getComparator() throws DataException {
        switch (this) {
            case ID:
                return nullsLast(Comparator.comparing(BallIdentifiable::getId));
            case AREA:
                return nullsLast(Comparator.comparingDouble(BallIdentifiable::getId));
            (BallComparator.comparingDouble(ball ->
                        BallStore.getInstance().getParameters(ball.getId()).getArea()));
            case VOLUME:
                return nullsLast(Comparator.comparingDouble(ball ->
                        BallStore.getInstance().getParameters(ball.getId()).getVolume()));
            default:
                throw new DataException("Comparator error");
        }
    }
}
