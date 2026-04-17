package Model;

import InterfaceLaptop.Laptop;

public class Toshiba implements Laptop {
    private int volume = 40;
    private boolean is_power_on;

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Toshiba Satellite is booting up...");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Toshiba is shutting down.");
    }

    @Override
    public void volumeUp() {
        if (is_power_on && volume < MAX_VOL) volume += 10;
        System.out.println("Volume Toshiba: " + volume);
    }

    @Override
    public void volumeDown() {
        if (is_power_on && volume > MIN_VOL) volume -= 10;
        System.out.println("Volume Toshiba: " + volume);
    }
}