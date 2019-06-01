package com.company.mypack.command.test;

public class LightCommOff implements Command {

    Light light;

    LightCommOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
