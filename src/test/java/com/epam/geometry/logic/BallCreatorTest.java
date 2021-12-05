package com.epam.geometry.logic;

import org.junit.Assert;
import org.junit.Test;
import com.epam.geometry.entity.Ball;
import com.epam.geometry.entity.Point;

public class BallCreatorTest {
    private final static String VALID_LINE = "6.0 3.0 3.0 7.0";
    private final static String INVALID_LINE = "-2.0 3.0 3.0 7.0";

    private final BallCreator ballCreator = new BallCreator();

    @Test
    public void testBallCreatorShouldCreateBallWhenLineIsValid(){
        //given
        Ball actualBall = new Ball(6.0, new Point(3.0, 3.0, 7.0));
        //when
        Ball createdBall = ballCreator.createBall(VALID_LINE);
        //then
        Assert.assertEquals(actualBall, createdBall);
    }

    @Test
    public void testBallCreatorShouldCreateBallWhenLineIsInvalid(){
        //given
        Ball actualBall = new Ball(-9.0, new Point(3.0, 3.0, 7.0));
        //when
        Ball createdBall = ballCreator.createBall(INVALID_LINE);
        //then
        Assert.assertEquals(actualBall, createdBall);
    }
}
