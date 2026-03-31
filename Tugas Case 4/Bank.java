class Bank {

    // 1️⃣ Transfer sesama rekening
    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan);
    }

    // 2️⃣ Transfer ke bank lain
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan);
    }

    // 3️⃣ Transfer dengan berita
    void transferUang(int jumlah, String rekeningTujuan,
                      String bankTujuan, String berita) {
        System.out.println("Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan +
                " dengan berita: " + berita);
    }

    // 4️⃣ Suku bunga standar
    void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }

    // Bonus: hitung biaya transfer
    int hitungBiayaTransfer(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BNI") ||
            bankTujuan.equalsIgnoreCase("BCA")) {
            return 6500;
        } else {
            return 0;
        }
    }
}