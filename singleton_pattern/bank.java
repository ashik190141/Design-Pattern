public class bank {
    int totalAmount = 20000;

    void deposit(int amount) {
        totalAmount += amount;
    }

    void withdraw(int amount) {
        totalAmount -= amount;
    }

}
