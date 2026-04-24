package Tugas_Project;

public class MainProject {
    public static void main(String[] args) {
        Gudang<Produk> gudang = new Gudang<>();
        gudang.tambah(new Produk("Laptop", 15000000));
        gudang.tampilkanSemua();
    }
}