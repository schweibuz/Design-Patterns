package com.company.mypack.command.commandRemoteControl;

public class HottubOnCommand implements Command {

    Hottub hottub;

    HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }

    @Override
    public void undo() {
        hottub.bubblesOff();
        hottub.cool();
        hottub.off();
    }
}
