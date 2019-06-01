package com.company.mypack.command.commandBook;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
