package com.company.mypack.observer.observerMatch;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EnglandTV implements Observer, Display {

    private int left, right;
    private Match match;
    FileHandler fileHandler;
    String string;
    Logger logger = Logger.getLogger("MyLog");

    EnglandTV(Match match) {
        this.match = match;
        try {
            fileHandler = new FileHandler("/users/andmat/desktop/ObserverLogFile.log", true);
            SimpleFormatter formatter = new SimpleFormatter();
            logger.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        logger.info(string);

    }

    @Override
    public void update(int left, int right) {
        this.left = left;
        this.right = right;
        string = "CountingEGTV  –  " + left + " : " + right + "\n";
        display();
    }
}
