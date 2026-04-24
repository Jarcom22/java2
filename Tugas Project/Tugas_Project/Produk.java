package Tugas_Project;

public class Produk extends Item {
    private double harga;

    public Produk(String nama, double harga) {
        super(nama);
        this.harga = harga;
    }

    @Override
    public void tampilkanInfo() {
        // Ganti System.out.println menjadi System.out.printf di bawah ini:
        System.out.printf("Produk: %s | Harga: Rp%.0f\n", getNama(), harga);
    }
}