package com.epam.geometry.observer;

import com.epam.geometry.entity.Ball;
import com.epam.geometry.entity.Point;
import com.epam.geometry.logic.DataException;

import java.util.ArrayList;
import java.util.List;

public class BallIdentifiable extends Ball implements Observable {

    private final Integer id;
    private final List<Observer> observers = new ArrayList<>();

    public BallIdentifiable(Integer id, double radius, Point center) {
        super(radius, center);
        this.id = id;
    }
    public Integer getId(){
        return id;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void attach(Observer observer) throws DataException {
        observers.add(observer);
        notifyObservers();
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() throws DataException {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void setValueX(Point valueX) throws DataException {
        super.setValueX(valueX);
        notifyObservers();
    }

    @Override
    public void setValueY(Point valueY) throws DataException {
        super.setValueY(valueY);
        notifyObservers();
    }

    @Override
    public void setValueZ(Point valueZ) throws DataException {
        super.setValueZ(valueZ);
        notifyObservers();
    }
}
