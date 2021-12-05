package BharatBankAssignment;

class BharatBank {
    String customerName;
    private int balance;

    BharatBank(String customerName, int balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    public int deposit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }

        return this.balance;
    }

    public int getBalance() {
        return this.balance;
    }
}
