class Tabungan {
    private double saldo;

    void tambah(double jumlah) {

        saldo += jumlah;
    }

    void ambil(double jumlah) {
        saldo -= jumlah;
    }

    void infoSaldo() {
        System.out.println("Saldo :" + saldo);
    }
}

public class Contoh {
    public static void main(String[] arg) {
        Tabungan fajar = new Tabungan();
        // fajar.saldo = -100000;
        fajar.tambah(100000);
        fajar.ambil(5000);
        fajar.infoSaldo();
    }
}