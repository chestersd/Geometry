package com.epam.geometry.logic;

public class Director {

    private BallReader reader;
    private BallValidator validator;
    private BallCreator creator;

    public Director(BallReader reader, BallValidator validator, BallCreator  creator){
        this.reader = reader;
        this.validator = validator;
        this.creator = creator;
    }
}
