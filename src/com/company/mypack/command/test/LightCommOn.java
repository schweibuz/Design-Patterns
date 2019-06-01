package com.company.mypack.command.test;

public class LightCommOn implements Command {

    Light light;

    LightCommOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
