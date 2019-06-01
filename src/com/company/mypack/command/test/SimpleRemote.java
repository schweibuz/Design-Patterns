package com.company.mypack.command.test;

public class SimpleRemote {

    private Command commandON;
    private Command commandOFF;

    SimpleRemote(Command on, Command off) {
        commandON = on;
        commandOFF = off;
    }

    public void on() {
        commandON.execute();
    }

    public void off() {
        commandOFF.execute();
    }
}
