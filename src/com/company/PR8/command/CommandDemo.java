package com.company.PR8.command;

public class CommandDemo {
    public static void main(String[] args) {
        Controller remote =
                new Controller();
        Engine engine = new Engine();
        Belt belt = new Belt();

        remote.setCommand(new BeltFasten(belt));
        remote.buttonWasPressed();
        remote.setCommand(new EngineStart(engine));
        remote.buttonWasPressed();
        remote.setCommand(new BeltUnfasten(belt));
        remote.buttonWasPressed();
        remote.setCommand(new EngineStop(engine));
        remote.buttonWasPressed();
    }
}