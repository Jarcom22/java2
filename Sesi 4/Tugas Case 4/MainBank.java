public class MainBank {
    public static void main(String[] args) {

        System.out.println("=== BANK UMUM ===");
        Bank bank = new Bank();
        bank.transferUang(1000000, "123456789");
        bank.transferUang(2000000, "987654321", "Mandiri");
        bank.transferUang(3000000, "111222333", "BRI", "Bayar Hutang");
        bank.sukuBunga();

        System.out.println("\n=== BANK BNI ===");
        Bank bni = new BankBNI();
        bni.transferUang(500000, "222333444", "bebas");
        bni.sukuBunga();

        System.out.println("\n=== BANK BCA ===");
        Bank bca = new BankBCA();
        bca.transferUang(750000, "555666777", "bebas");
        bca.sukuBunga();
    }
}