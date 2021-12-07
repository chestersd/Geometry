package com.epam.geometry.logic;

import com.epam.geometry.entity.Ball;
import com.epam.geometry.entity.Point;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;

public class DirectorTest {

    private static final String VALID_PATH = "valid path";
    private static final String VALID_LINE = "2.0 3.0 4.0 5.0";
    private static final String INVALID_LINE = "-6.0 3.0 4.0 5.0";
    private static final Ball BALL = new Ball(2.0,new Point(3.0, 4.0, 5.0));

    @Test
    public void testDirectorShouldReadWhenLineIsCorrect() throws DataException{
        //given
        BallReader reader = Mockito.mock(BallReader.class);
        BallValidator validator = Mockito.mock(BallValidator.class);
        BallCreator creator = Mockito.mock(BallCreator.class);
        //when
        Mockito.when(reader.read(VALID_PATH)).thenReturn((List<String>) reader);
        Mockito.when(validator.isBall(VALID_LINE)).thenReturn(true);
        Mockito.when(creator.createBall(VALID_LINE)).thenReturn(BALL);
        Director director = new Director(reader, validator, creator);
        Ball expectedBall = BALL;
        Ball actualBall = (Ball) director.read(VALID_PATH);
        //then
        Assert.assertEquals(expectedBall, actualBall);
    }

    @Test
    public void testDirectorShouldReadWhenLineIsIncorrect() throws DataException{
        //given
        BallReader reader = Mockito.mock(BallReader.class);
        BallValidator validator = Mockito.mock(BallValidator.class);
        BallCreator creator = Mockito.mock(BallCreator.class);
        //when
        Mockito.when(reader.read(VALID_PATH)).thenReturn((List<String>) reader);
        Mockito.when(validator.isBall(INVALID_LINE)).thenReturn(true);
        Mockito.when(creator.createBall(INVALID_LINE)).thenReturn(BALL);
        Director director = new Director(reader, validator, creator);
        Ball expectedBall = BALL;
        Ball actualBall = (Ball) director.read(VALID_PATH);
        //then
        Assert.assertEquals(expectedBall, actualBall);
    }


}
