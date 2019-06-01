package com.company.mypack.command.commandRemoteControl;


public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    StackForUndo forUndo;
    private static int undoCount = 0;
    private static int tmp1;
    private static int tmp2;

    private final int NUMBER_OF_BUTTONS = 10;

    public RemoteControl() {
        onCommands = new Command[NUMBER_OF_BUTTONS];
        offCommands = new Command[NUMBER_OF_BUTTONS];

        Command noCommand = new NoCommand();

        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        forUndo = new StackForUndo();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            forUndo.pushItem(onCommands[slot]);
            undoCount++;
            tmp1 = undoCount;
            tmp2 = tmp1++;
        }
    }

    public void offButtonWasPushed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
            forUndo.pushItem(offCommands[slot]);
            undoCount++;
            tmp1 = undoCount;
            tmp2 = tmp1++;
        }
    }

    public void undoButtonWasPushed() {
        System.out.println(" –––––––– UNDO –––––––– ");
        if (tmp1 > tmp2) {
            tmp2--;
            forUndo.getItem(tmp2).undo();
        } else {
            forUndo.getItem(undoCount).undo();
            tmp1++;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n–––––––– Remote Control ––––––––\n");

        for (int i = 0; i < onCommands.length; i++)
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " +
                    offCommands[i].getClass().getName() + "\n");

        stringBuffer.append("[undo] " + forUndo.getItem(undoCount - 1).getClass().getName() + "\n");

        return stringBuffer.toString();
    }
}
