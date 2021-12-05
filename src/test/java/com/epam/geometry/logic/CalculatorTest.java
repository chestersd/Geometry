package com.epam.geometry.logic;

import com.epam.geometry.entity.*;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculateAreaShouldCalculateAreaWhenBallIsBall(){
        //given
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
    public void testCalculateDistanceShouldCalculateDistanceWhenBallIsBall(){
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
    public void testIsCrossShouldReturnTrueWhenRadiusIsMoreOrEqualsThenDistance(){
        //given
        Calculator calculator = new Calculator();
        Axis ZY;
        Point point = new Point(4.0, 7.0, 7.7);
        Ball ball = new Ball(11.0, point);
        double distance = calculator.calculateDistance(Axis.ZY, point);
        boolean isCross;
        //when
        isCross = calculator.isCross(ball, Axis.ZY);
        //then
        Assert.assertTrue(isCross);
    }

    @Test
    public void testCalculateRatioOfVolumeShouldCalculateRatioOfVolumeWhenBallCrossAxis(){
        //given
        Calculator calculator = new Calculator();
        Axis XY;
        Point point = new Point(14.0, 13.0, 2.0);
        Ball ball = new Ball(15.0, point);
        //when
        double ratio = calculator.calculateRatioOfVolume(ball, point, Axis.XY);
        //then
        Assert.assertEquals(0.668,ratio, 0.001);
    }
}
