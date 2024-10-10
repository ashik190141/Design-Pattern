import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        int withdrawAmount = in.nextInt();
        in.close();
        bank b = new bank();
        b.deposite(quantity);
        b.loan();
        atm Atm = new atm(b);
        Atm.withdraw(withdrawAmount);
    }
}
