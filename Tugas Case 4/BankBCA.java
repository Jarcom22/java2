public class BankBCA extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah 4.5%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BCA";
        int biaya = hitungBiayaTransfer(bankTujuan);

        System.out.println("Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan +
                " dengan biaya Rp" + biaya);
    }
}