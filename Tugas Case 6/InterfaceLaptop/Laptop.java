package InterfaceLaptop;

public interface Laptop {
    int MAX_VOL = 100; // [cite: 518]
    int MIN_VOL = 0;   // [cite: 520]

    void powerOn();    // [cite: 523]
    void powerOff();   // [cite: 525]
    void volumeUp();   // [cite: 527]
    void volumeDown(); // [cite: 529]
}