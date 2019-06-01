package com.company.mypack.command.base;

public class UpdateCommand implements Command {

    Database database;

    UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
