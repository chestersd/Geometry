package com.epam.geometry.observer;

import com.epam.geometry.entity.Ball;
import com.epam.geometry.entity.Point;
import com.epam.geometry.logic.Calculator;
import com.epam.geometry.logic.DataException;
import com.epam.geometry.observer.Observable;
import com.epam.geometry.observer.Observer;

import java.util.HashMap;
import java.util.Map;

public class BallStore extends Ball implements Observable {

    private final Map<Integer, Parameters> parameters = new HashMap<>();

//    private Integer id;

    private static Calculator calculator = new Calculator();
    private static BallStore instance;

    public static BallStore getInstance(){
        if (instance  == null) {
            instance = new BallStore();
        }
        return  instance;
    }

    public BallStore(double radius, Point center) {
        super(radius, center);
    }

    @Override
    public void update(BallIdentifiable ball) throws DataException {
        double area = calculator.calculateArea(ball);
        double volume = calculator.calculateVolume(ball);
        parameters.put(ball.getId(), new Parameters(area, volume));
    }

    public Map<Integer, Parameters> getParameters(){
        return parameters;
    }

    public Parameters getParameters(Integer id) {
        return parameters.get(id);
    }


}
