package Model;

import InterfaceLaptop.Laptop;

public class LaptopUser {
    private Laptop laptop; // [cite: 534]

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop; // [cite: 534]
    }

    public void turnOnLaptop() { this.laptop.powerOn(); }   // [cite: 534]
    public void turnOffLaptop() { this.laptop.powerOff(); } // [cite: 534]
    public void makeLaptopLouder() { this.laptop.volumeUp(); } // [cite: 534]
    public void makeLaptopSilence() { this.laptop.volumeDown(); } // [cite: 534]
}