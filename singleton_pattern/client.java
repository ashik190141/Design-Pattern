public class client {
    public static void main(String[] args) {
        bank b1 = new bank();
        show_amount s1 = show_amount.getAccess();
        b1.deposit(1000);
        b1.withdraw(2000);
        s1.show(b1);
    }
}