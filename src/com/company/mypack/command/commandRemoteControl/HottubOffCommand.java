package com.company.mypack.command.commandRemoteControl;

public class HottubOffCommand implements Command {

    Hottub hottub;

    HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.cool();
        hottub.bubblesOff();
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }
}
