package com.company.mypack.command.commandRemoteControl;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackForUndo {

    Command[] commands;
    static int size = 0;
    private static final Command NOT_FOUND = new NoCommand();

    StackForUndo() {
        this(5);
    }

    private StackForUndo(int capacity) {
        commands = new Command[capacity];
    }

    public Command getItem(int item) {
        if (isEmpty() || item < 0) {
            System.out.println("Stack is empty");
            return NOT_FOUND;
        }
/*        if (item < 0) {
            throw new ArrayIndexOutOfBoundsException("There is nothing is order to undo");
        }*/
        if (size == item)
            return commands[item - 1];
        else {
            int tmp = size - item;
            return commands[size - tmp];
        }
    }

    public void ensureCapacity(int curSize) {
        if (curSize - commands.length > 0)
            commands = Arrays.copyOf(commands, (commands.length * 2 / 3) * 2);
    }

    public void pushItem(Command command) {
        ensureCapacity(size + 1);
        commands[size++] = command;
    }

    public Command popItem() {
        Command tmp;
        if (size == 0)
            throw new EmptyStackException();
        tmp = commands[size - 1];
        size--;
        commands[size] = null;
        return tmp;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
