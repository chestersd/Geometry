package com.epam.geometry.logic;

import java.util.List;

public interface BallReader {
    List<String> read(String path) throws DataException;
}
