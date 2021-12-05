package BharatBankAssignment;

class SavingsAccount extends BharatBank {
    SavingsAccount(String customerName, int balance) {
        super(customerName, balance);
    }

    public int calculateInterest(float duration) {
        int interestRate = 3;
        return (int) ((float) this.getBalance() * duration * (float) interestRate / 100.0F);
    }
}
