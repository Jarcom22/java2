package Model;

import InterfaceLaptop.Laptop;

public class Lenovo implements Laptop {
    private int volume = 50; // [cite: 555]
    private boolean is_power_on;

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is On... Lenovo ThinkPad"); // [cite: 579, 580]
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutdown in process..."); // [cite: 584]
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume is Full"); // [cite: 604]
            } else {
                this.volume += 10; // [cite: 605]
                System.out.println("Volume Lenovo: " + this.volume);
            }
        }
    }

    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume == MIN_VOL) {
                System.out.println("Volume is 0%"); // [cite: 629]
            } else {
                this.volume -= 10;
                System.out.println("Volume Lenovo: " + this.volume);
            }
        }
    }
}