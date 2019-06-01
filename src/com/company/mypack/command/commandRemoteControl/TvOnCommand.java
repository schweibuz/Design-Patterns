package com.company.mypack.command.commandRemoteControl;

public class TvOnCommand implements Command {

    TV tv;

    TvOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
