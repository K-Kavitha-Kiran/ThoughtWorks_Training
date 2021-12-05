package BharatBankAssignment;

class CurrentAccount extends BharatBank {
    private final int interestRate = 0;
    private final int overDraftPercentage = 20;

    CurrentAccount(String customerName, int balance) {
        super(customerName, balance);
    }

    public int withdraw(int amount) {
        int balance = this.getBalance();

        if (balance * 120 / 100 >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }

        return balance;
    }

    public int calculateInterest(float duration) {
        return (int) ((float) this.getBalance() * duration * 0.0F / 100.0F);
    }
}