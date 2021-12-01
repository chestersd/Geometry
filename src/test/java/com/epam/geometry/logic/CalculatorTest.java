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
        Assert.assertEquals(615.752032, area, 0.000001);
    }
}
