package com.epam.geometry.observer;

import com.epam.geometry.logic.DataException;

public interface Observable {

    void attach(Observer observer) throws DataException;

    void detach(Observer observer);

    void notifyObservers() throws DataException;
}
