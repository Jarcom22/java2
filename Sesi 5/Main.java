public class Main {
    public static void main(String[] args) {
        BankAccount fajar = new BankAccount(1000000, "8790094922", "Fajar");
        fajar.deposit(5000000);
        fajar.withdraw(500000);
        System.out.println(fajar);
    }
}
