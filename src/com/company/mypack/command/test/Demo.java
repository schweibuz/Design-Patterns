package com.company.mypack.command.test;

public class Demo {
    public static void main(String[] args) {

        Light light = new Light();
        Command commOn = new LightCommOn(light);
        Command commOff = new LightCommOff(light);

        SimpleRemote simpleRemote = new SimpleRemote(commOn, commOff);

        simpleRemote.on();
        simpleRemote.off();

        simpleRemote.on();
    }
}
