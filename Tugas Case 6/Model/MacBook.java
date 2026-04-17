package Model;

import InterfaceLaptop.Laptop;

public class MacBook implements Laptop {
    private int volume = 60;
    private boolean is_power_on;

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("MacBook Pro: Welcome to macOS");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("MacBook Pro is sleeping.");
    }

    @Override
    public void volumeUp() {
        if (is_power_on && volume < MAX_VOL) volume += 5; // MacBook naik per 5
        System.out.println("Volume MacBook: " + volume);
    }

    @Override
    public void volumeDown() {
        if (is_power_on && volume > MIN_VOL) volume -= 5;
        System.out.println("Volume MacBook: " + volume);
    }
}