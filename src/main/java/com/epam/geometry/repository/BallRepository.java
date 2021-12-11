package com.epam.geometry.repository;

import com.epam.geometry.logic.DataException;
import com.epam.geometry.observer.BallIdentifiable;

public interface BallRepository {
    void add(BallIdentifiable ball);
    void delete(BallIdentifiable ball);
    void update(BallIdentifiable ball);

    List<BallIdentifiable> query(final Specification specification) throws DataException;
    List<BallIdentifiable> sort(BallComparator<BallIdentifiable> comparator) throws DataException;
}
