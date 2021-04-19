package com.company.PR8.command;

// Stereo and its command classes
class Belt {
    public void on() {
        System.out.println("Seat belt is fasten");
    }

    public void off() {
        System.out.println("Seat belt is unfasten");
    }

    public void checkBelt() {
        System.out.println("Check the seat belt");
    }

    public void setBelt(int volume) {
        System.out.println("Belt is set to"
                + volume);
    }
}
