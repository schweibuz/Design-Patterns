package com.company.mypack.command.base;

public class SelectCommand implements Command {

    Database database;

    SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
