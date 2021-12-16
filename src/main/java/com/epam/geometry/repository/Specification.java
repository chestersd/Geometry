package com.epam.geometry.repository;

import com.epam.geometry.logic.DataException;
import com.epam.geometry.observer.BallIdentifiable;

public interface Specification {

    boolean specified(BallIdentifiable ball) throws DataException;
}
