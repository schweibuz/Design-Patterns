package com.company.mypack.command.base;

public class InsertCommand implements Command {

    Database database;

    InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
