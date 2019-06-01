package com.company.mypack.command.commandRemoteControl;

public class Light {

    private String describe = "";

    Light(String describe) {
        this.describe = describe;
    }

    public void on() {
        System.out.println("Light in " + describe + " turn on");
    }

    public void off() {
        System.out.println("Light in " + describe + " turn off");
    }
}
