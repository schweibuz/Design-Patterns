package com.company.mypack.command.base;

public class DeleteCommand implements Command {

    Database database;

    DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
