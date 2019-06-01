package com.company.mypack.command.commandRemoteControl;

public class TvOffCommand implements Command {

    TV tv;

    TvOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
        tv.setInputChannel();
    }
}
