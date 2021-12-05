package com.epam.geometry.logic;

import org.junit.Assert;
import org.junit.Test;

public class BallValidatorTest {

    private static final String VALID_LINE = "6.0 3.0 3.0 7.0";
    private static final String INVALID_LINE = "6.0f 3.0 3.0 7.0";

    private final BallValidator validator = new BallValidator();

    @Test
    public void testIsBallShouldReturnTrueWhenTheLineIsValid() {
        //given
        //when
        boolean status = validator.isBall(VALID_LINE);
        //then
        Assert.assertTrue(status);
    }

    @Test
    public void testIsBallShouldReturnTrueWhenTheLineIsInvalid() {
        //given
        //when
        boolean status = validator.isBall(INVALID_LINE);
        //then
        Assert.assertFalse(status);
    }
}
