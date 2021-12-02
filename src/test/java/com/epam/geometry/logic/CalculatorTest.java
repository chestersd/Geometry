package com.epam.geometry.logic;

import com.epam.geometry.entity.*;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculateAreaShouldCalculateAreaWhenBallIsBall(){
        //given
//        Calculator
        Ball ball = new Ball(7.0, new Point(0.0, 0.0, 0.0));
        //when
        double area = Calculator.calculateArea(ball);
        //then
        Assert.assertEquals(615.752, area, 0.001);
    }

    @Test
    public void testCalculateVolumeShouldCalculateVolumeWhenBallIsBall(){
        //given
        Calculator calculator = new Calculator();
        Point point = new Point(5.0, 5.0, 7.0);
        Ball ball = new Ball(8.0, point);
        //when
        double volume = calculator.calculateVolume(ball);
        //then
        Assert.assertEquals(2144.660584, volume, 0.001);
    }

    @Test
    public void testСalculateDistanceShouldСalculateDistanceWhenBallIsBall(){
        //given
        Calculator calculator = new Calculator();
        Axis XY;
        Point point = new Point(2.0, 7.0, 7.7);
        //when
        double distance = calculator.calculateDistance(Axis.XY, point);
        //then
        Assert.assertEquals(7.7, distance, 0.001);
    }

    @Test
    public void testIsCrossShouldReturnTrueWhenRadiusIsMoreThenDistance(){
//        //given
//        Calculator calculator = new Calculator();
//        Axis XY;
//        Point point = new Point(2.0, 7.0, 7.7);
//        //when
//        double distance = calculator.calculateDistance(Axis.XY, point);
//        //then
//        Assert.assertEquals(7.7, distance, 0.001);
    }
}
