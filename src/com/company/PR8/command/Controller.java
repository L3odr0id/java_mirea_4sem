package com.company.PR8.command;


class Controller {
    Action slot;

    public Controller() {}

    public void setCommand(Action action) {
        slot = action;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
