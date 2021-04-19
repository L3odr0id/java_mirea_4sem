package com.company.PR8.command;

class BeltUnfasten implements Action {
    Belt belt;

    public BeltUnfasten(Belt belt) {
        this.belt = belt;
    }

    public void execute() {
        belt.off();
    }
}
