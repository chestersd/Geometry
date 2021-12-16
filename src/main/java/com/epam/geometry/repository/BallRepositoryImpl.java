package com.epam.geometry.repository;

import com.epam.geometry.observer.BallIdentifiable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BallRepositoryImpl implements BallRepository{

    private Map<Integer, BallIdentifiable> store = new HashMap<>();


    @Override
    public void add(BallIdentifiable ball) {
        Integer id = ball.getId();
        store.put(id, ball);
    }

    @Override
    public void delete(BallIdentifiable ball) {
        Integer id = ball.getId();
        store.remove(id, ball);
    }

    @Override
    public void update(BallIdentifiable ball) {
        Integer id = ball.getId();
        store.put(id, ball);
    }

    @Override
    public List<BallIdentifiable> query(final Specification specification) {
        List<BallIdentifiable> balls = new ArrayList<>();
        for (BallIdentifiable ball : store.values()){
            if (specification.specified(ball)){
                balls.add(ball);
            }
        }
        return balls;
    }

    @Override
    public List<BallIdentifiable> sort(BallComparator<BallIdentifiable> comparator) {
        List<BallIdentifiable> result = new ArrayList<>();
        result.sort(comparator);
        return result;
    }
}
