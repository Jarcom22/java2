package Tugas_Project;

public abstract class Item implements Inventaris {
    private String nama; // Encapsulation

    public Item(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}