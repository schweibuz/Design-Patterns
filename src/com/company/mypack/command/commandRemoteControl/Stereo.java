package com.company.mypack.command.commandRemoteControl;

public class Stereo {

    private String location = "";

    Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo On");
    }

    public void off() {
        System.out.println(location + " Stereo Off");
    }

    public void setCd() {
        System.out.println(location + " Set CD");
    }

    public void setDvd() {
        System.out.println(location + " Set DVD");
    }

    public void setRadio() {
        System.out.println(location + " Set Radio");
    }

    public void setVolume(int volume) {
        System.out.println(location + " Volume: " + volume);
    }
}
