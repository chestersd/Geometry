package com.epam.geometry.logic;

import com.epam.geometry.entity.Ball;
import com.epam.geometry.logic.BallCreator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class BallReader {

    private String pathname;

    public List<Ball> read(BallCreator pathname) {
        try {
            File file = new File();
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
