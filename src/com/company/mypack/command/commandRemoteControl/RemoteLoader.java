package com.company.mypack.command.commandRemoteControl;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCd = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);

        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        //Macro commands to "Party Macro"
        Command[] partyOn = {livingRoomLightOn, stereoOnWithCd, tvOnCommand, hottubOnCommand};
        Command[] partyOff = {livingRoomLightOff, stereoOff, tvOffCommand, hottubOffCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(3, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(5, stereoOnWithCd, stereoOff);
        remoteControl.setCommand(6, tvOnCommand, tvOffCommand);
        remoteControl.setCommand(7, hottubOnCommand, hottubOffCommand);
        remoteControl.setCommand(8, partyOnMacro, partyOffMacro);


//        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(7);
        remoteControl.offButtonWasPushed(7);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        System.out.println("--- Pushing Macro ON ---");
        remoteControl.onButtonWasPushed(8);
        System.out.println("--- Pushing Macro OFF ---");
        remoteControl.offButtonWasPushed(8);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        for (int i = 0; i < 20; i++) {
            remoteControl.undoButtonWasPushed();
        }

    }
}
