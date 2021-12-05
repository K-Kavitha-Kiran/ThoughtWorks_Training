package BharatBankAssignment;

public class BharatBankMain {

    public static void main(String[] args) {
        CurrentAccount GopalAccount = new CurrentAccount("Gopal", 50000);
        SavingsAccount AmritaAccount = new SavingsAccount("Amrita", 100000);

        System.out.println(GopalAccount.customerName + " balance " + GopalAccount.deposit(10000));

        System.out.println(AmritaAccount.customerName + " balance " + AmritaAccount.withdraw(45000));

        System.out.println(GopalAccount.customerName + " balance " + GopalAccount.withdraw(70000));

        System.out.println(GopalAccount.customerName + " interest " + GopalAccount.calculateInterest(0.25F));
        System.out.println(AmritaAccount.customerName + " interest " + AmritaAccount.calculateInterest(0.25F));
    }
}