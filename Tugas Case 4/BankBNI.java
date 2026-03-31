public class BankBNI extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI";
        int biaya = hitungBiayaTransfer(bankTujuan);

        System.out.println("Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan +
                " dengan biaya Rp" + biaya);
    }
}