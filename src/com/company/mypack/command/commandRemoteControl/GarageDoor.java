package com.company.mypack.command.commandRemoteControl;

public class GarageDoor {

    private String location = "";

    GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + "Garage Door is Open");
    }

    public void down() {
        System.out.println(location + "Closing Garage Door");
    }
}
