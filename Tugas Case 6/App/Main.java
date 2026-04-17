package App;

import InterfaceLaptop.Laptop;
import Model.*;
import java.util.Scanner; // [cite: 651]

public class Main {
    public static void main(String[] args) {
        // Inisialisasi awal (Bisa diganti Toshiba() atau MacBook())
        Laptop device = new Lenovo(); 
        LaptopUser user = new LaptopUser(device);
        
        Scanner input = new Scanner(System.in); // [cite: 651]
        String perintah;
        boolean loop = true;

        System.out.println("--- KONTROL LAPTOP ---");
        System.out.println("Perintah: ON, OFF, UP, DOWN, EXIT");

        while (loop) {
            System.out.print("Masukkan input: ");
            perintah = input.nextLine().toUpperCase(); //

            switch (perintah) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilence();
                    break;
                case "EXIT":
                    loop = false;
                    break;
                default:
                    System.out.println("Input salah!");
            }
        }
        input.close();
    }
}