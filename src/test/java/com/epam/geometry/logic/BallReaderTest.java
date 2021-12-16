package com.epam.geometry.logic;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class BallReaderTest {

    private final BallReaderImpl reader = new BallReaderImpl();
    String pathname = "src/test/resources/BALLS.txt";

    @Test
    public void testReadShouldReadWhenFileIsFound() throws DataException{
        //given
        String testLine = "6.0 3.0 3.0 7.0";
        List<String> expectedLines = Arrays.asList(testLine);
        //when
        List<String> actualLines = reader.read(pathname);
        //then
        Assert.assertEquals(expectedLines, actualLines);

    }


}
