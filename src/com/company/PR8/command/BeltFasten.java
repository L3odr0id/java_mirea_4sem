package com.company.PR8.command;

class BeltFasten implements Action {
    Belt belt;

    public BeltFasten(Belt belt) {
        this.belt = belt;
    }

    public void execute() {
        belt.on();
    }
}
