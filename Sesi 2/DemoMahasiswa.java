class Mahasiswa {
    // ========= Atribut (property) =====
    // "private" artinya hanya bisa di akses dari dalam kelas ini saja
    private String nama;
    private int umur;

    // ====== Konstruktor =====
    // Konstruktor akan otomatis dipanggil saat object baru dibuat dengan "new"
    // parameter di dalam konstruktor digunakan untuk mengisi nilai awal atribut
    public Mahasiswa(String nama, int umur) {
        // kata kunci "this" dipakai untuk membedakan
        // antara atribut kelas (this.nama) dengan parameter method (nama)
        this.nama = nama;
        this.umur = umur;
    }

    // ===== Getter ======
    // Getter dipakai untuk "membaca"/mengambil nilai atribut
    public String getNama() {
        return this.nama; // "this.nama" merujuk ke atribut di kelas
    }

    public int getUmur() {
        return this.umur;
    }

    // ===== Setter =====
    // Setter dipakai untuk mengubah nilai atribut dari luar kelas
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        // bisa tambahkan logika sederhana (misalnya validasi)
        if (umur > 0) {
            this.umur = umur;
        }
    }

    // method tambahan untuk menampilkan info mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
    }
}

// class utama yang memiliki method
public class DemoMahasiswa {

    public static void main(String[] args) {
        // membuat dua objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi", 20);
        Mahasiswa mhs2 = new Mahasiswa("Siti", 22);

        // memanggil metode untuk menampilkan informasi
        System.out.println("Data Mahasiswa 1:");
        mhs1.tampilkanInfo();

        System.out.println();
        System.out.println("Data Mahasiswa 2:");
        mhs2.tampilkanInfo();

        // contoh penggunaan getter/setter
        mhs1.setUmur(21);
        System.out.println();
        System.out.println("Setelah mengubah umur mhs1:");
        mhs1.tampilkanInfo();
    }
}