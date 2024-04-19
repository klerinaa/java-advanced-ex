package bankAccEx;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNUmber, double balance) {
        super(accountNUmber, balance);
    }

    @Override
    void withdraw(double amount) {
        if(getBalance()-amount<100){
            System.out.println("Minimum balance $100 required!");
        }else{
            super.withdraw(amount);
        }
    }
}
