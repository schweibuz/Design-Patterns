package com.company.mypack.command.commandRemoteControl;

public class TV {

    String location;
    int channel;

    TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is On");
    }

    public void off() {
        System.out.println(location + " TV is Off");
    }

    public void setInputChannel() {
        channel = 3;
        System.out.println("Channel is set for VCR");
    }
}
