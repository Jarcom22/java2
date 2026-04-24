package Tugas_Project;
import java.util.ArrayList;

public class Gudang<T extends Item> { // Generic
    private ArrayList<T> daftarItem = new ArrayList<>(); // Collection

    public void tambah(T item) { daftarItem.add(item); }

    public void tampilkanSemua() {
        for (T item : daftarItem) {
            item.tampilkanInfo();
        }
    }
}