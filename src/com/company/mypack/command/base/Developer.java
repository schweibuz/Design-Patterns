package com.company.mypack.command.base;

public class Developer {

    Command insertCommand;
    Command updateCommand;
    Command selectCommand;
    Command deleteCommand;

    Developer(InsertCommand insertCommand, UpdateCommand updateCommand,
              SelectCommand selectCommand, DeleteCommand deleteCommand) {
        this.insertCommand = insertCommand;
        this.updateCommand = updateCommand;
        this.selectCommand = selectCommand;
        this.deleteCommand = deleteCommand;
    }

    public void insertRecord() {
        insertCommand.execute();
    }

    public void updateRecord() {
        updateCommand.execute();
    }

    public void selectRecord() {
        selectCommand.execute();
    }

    public void deleteRecord() {
        deleteCommand.execute();
    }
}
