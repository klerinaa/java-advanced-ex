package bankAccEx;

public class MainBank {
    public static void main(String[] args) {
        System.out.println("Create a bank Account with no BA1234 with balance $500");
        BankAccount BA1234= new BankAccount("BA1234",500);


        // Depositoj $1000 ne BA1234
        BA1234.deposit(1000);
        System.out.println("New balance after depositing $1000: $" + BA1234.getBalance());

        // Terheq $600 ne BA1234
        BA1234.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + BA1234.getBalance());

        System.out.println("Create a bank Account with no SA1234 with balance $800");
        SavingsAccount SA1234=new SavingsAccount("SA1234",800);
        // Terheq $600 ne SA1234
        SA1234.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + SA1234.getBalance());
        // Terheq $150 ne SA1234
        SA1234.withdraw(150);
        System.out.println("Balance after trying to withdraw $150: $" + SA1234.getBalance());
    }
}
