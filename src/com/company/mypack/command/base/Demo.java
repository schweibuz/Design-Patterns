package com.company.mypack.command.base;

public class Demo {
    public static void main(String[] args) {

        Database database = new Database();

        Developer developer = new Developer(new InsertCommand(database), new UpdateCommand(database),
                new SelectCommand(database), new DeleteCommand(database));

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();

    }
}
