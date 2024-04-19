package bankAccEx;



//    Write a Java program to create a class known as "BankAccount" with methods
//        called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw()
//        method to prevent withdrawals if the account balance falls below one hundred.
public class BankAccount {

    String accountNUmber;
    double balance;

    public BankAccount(String accountNUmber, double balance) {
        this.accountNUmber = accountNUmber;
        this.balance = balance;
    }

     void  deposit(double amount){
        balance+=amount;
    }
     void  withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }

    double getBalance(){
        return  balance;
    }
}
