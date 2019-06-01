package com.company.mypack.observer.observerMatch;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class EgyptTV implements Observer, Display {

    private int left, right;
    private Match match;


    EgyptTV(Match match) {
        this.match = match;
    }

    @Override
    public void display() {

        Path path = Paths.get("/Users/andmat/Desktop/hello.txt");
        String string = "CountingEGTV  –  " + left + " : " + right + "\n";
        String st;

        try (FileWriter writer = new FileWriter(String.valueOf(path)/*, true*/);
             BufferedWriter bufWrite = new BufferedWriter(writer))
        {
            bufWrite.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufRead = new BufferedReader(new FileReader(String.valueOf(path))))
        {
            while ((st = bufRead.readLine()) != null)
                System.out.println(st);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(int left, int right) {
        this.left = left;
        this.right = right;
        display();
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public Match getMatch() {
        return match;
    }
}
