public class atm implements facility{
    bank Bank;

    atm(bank bank) {
        this.Bank = bank;
    }
    @Override
    public void deposite(int amount) {
        
    }

    @Override
    public void loan() {
        
    }

    @Override
    public void withdraw(int amount) {
        int userCurrentAmount = Bank.amountBalance(); //21000
        userCurrentAmount -= amount; //110000
        System.out.println("Your total Amount is "+userCurrentAmount+" taka");
        Bank.withdraw(userCurrentAmount);
    }
    
}
