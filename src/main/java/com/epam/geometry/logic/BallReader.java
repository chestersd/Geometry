package com.epam.geometry.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BallReader {

    private String pathname;

    public List<String> read(String pathName) throws DataException {
        List<String> reader = new ArrayList<>();
        try {
            File file = new File(pathName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new DataException("File not found", e);
        } catch (IOException e) {
            throw new DataException("Input/Output error", e);
        }
        return reader;
    }
}
