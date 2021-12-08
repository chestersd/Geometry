package com.epam.geometry.observer;

import com.epam.geometry.logic.DataException;

public interface Observer {

    void update() throws DataException;
}
