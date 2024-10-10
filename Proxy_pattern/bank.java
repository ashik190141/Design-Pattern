public class bank implements facility {
    int totalAmount = 20000;
    @Override
    public void deposite(int amount) {
        totalAmount += amount; //21000
        System.out.println("Your Current Amount is " + totalAmount + " taka");
    }
    @Override
    public void loan() {
        System.out.println("You are requested loan for 100k taka");
    }

    @Override
    public void withdraw(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    int amountBalance() {
        return totalAmount;
    }

}
